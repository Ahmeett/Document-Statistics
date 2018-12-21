package edu.ceng;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Month;

/**
 * Main class
 */
public class Main {

    @Option(name = "-file",required = true, usage="Required")
    public String file;

    @Option(name = "-field",required = true, usage="Required")
    public FIELD field;

    @Option(name = "-month", required = true, usage="Required")
    public Month month;

    @Option(name = "-type", required = true, usage="Required")
    public TYPE type;


    private int run(String[] args) throws IOException {
        CmdLineParser p = new CmdLineParser(this);
        try {
            p.parseArgument(args);
            run();
            return 0;
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            p.printUsage(System.err);
            return 1;
        }
    }

    private void run() {



      try {

          Helper.printStats(file,field,month,type);

        } catch (IOException e) {
            e.printStackTrace();
        }



    }



    public static void main(String[] args) throws IOException {
        System.exit(new Main().run(args));
    }
}
