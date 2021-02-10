import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GitManager {

    public static List<Commit> commitList = new ArrayList<Commit>();
    public static Commit currentCommit;
    public static int commandCounter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (true) {
            command = scanner.nextLine();
            commandCounter++;
            if (command.contains("exit")) {
                System.out.println("program exited!");
                break;
            } else {
                executeCommnad(command);
            }
        }
    }

    private static void executeCommnad(String command) {
        if (command.equals("git init")) {
            System.out.println("Git repo inited!");
        } else if (command.contains("git commit")) {
            gitCommit(command);
        } else if (command.equals("git show all commit")) {
            showCommits();
        } else if (command.contains("git delete")) {
            deleteCommit(command);
        } else if (command.contains("git show commit")) {
            System.out.println(currentCommit.toString());
        } else {
            System.out.println("Unknown Command!");
        }
    }

    private static void deleteCommit(String command) {
        String[] commandSplit = command.split(" ");
        //validation.
        int commnadSequence = Integer.parseInt(commandSplit[2]);
        for (Iterator<Commit> commitIterator = commitList.iterator(); commitIterator.hasNext(); ) {
            Commit commit = commitIterator.next();
            if (commit.getCommitId() == commnadSequence) {
                commitIterator.remove();
            }
        }
    }

    private static void showCommits() {
        //            commitList.forEach(c -> System.out.println(c));   //have to use lamda, here use of loop is not effeciant.
        for (int cCounter = 0; cCounter < commitList.size(); cCounter++) {
            System.out.println(commitList.get(cCounter).toString());
        }
    }

    private static void gitCommit(String command) {
        String[] commandSplit = command.split(" ");
        String message = "";
        //commnad validation
        for (int c = 2; c < commandSplit.length; c++) {
            message += commandSplit[c];
        }
        Commit commit = new Commit(commandCounter, message);
        currentCommit = commit;
        commitList.add(commit);
        System.out.println("Commit message!");
    }
}
