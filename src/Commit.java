public class Commit {
    int commitId;
    String commitMessage;

    public Commit(int commitId, String commitMessage) {
        this.commitId = commitId;
        this.commitMessage = commitMessage;
    }

    public int getCommitId() {
        return commitId;
    }

    public void setCommitId(int commitId) {
        this.commitId = commitId;
    }

    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "commitId=" + commitId +
                ", commitMessage='" + commitMessage + '\'' +
                '}';
    }
}
