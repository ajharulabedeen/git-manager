#First Five has been done.#

"# git-manager" 
GIT Manager

We are about to create a GIT Manager on console using Python 3. We can’t use any database or UI framework. For Managing GIT we need to follow our custom command. Our Commands is listed below - 
1. git init
--- This command will be the start of GIT Manager. Without this command, we can’t execute other command.

2. git commit “commit message”
--- By this command, we will store this commit message with a auto generated sequence number. The sequence number must be integer and start with 1.

3. git show commit
--- By this command, we can show the current commit message.

4. git show all commit
--- By this command, we can view all commit commit message with sequence number. Like -
1 message-1
2 message-2
4 message-4

5. git delete commit_sequence
--- By this command, we can delete one commit. Here, commit_sequence will be sequence number.

6. git forward-commit
--- By this command, Our Current commit position will be forwarded one step.

7. git backward-commit
--- By this command, Our current commit position will be one step backward.

8. git jump commit_sequence_number
--- By this command, we can jump to an specific commit-sequence number.

9. git pull commit_sequence_number
--- By this command, we can pull one commit to forward. For example – If there is 4 commits sequence as 4,3,2,1 and we are in the 4th number and we execute “git pull 2”. means commit 2 will be current commit. And sequence will be 2,4,3,1.

10. exit
--- this the the termination command.

11. 8. git update “New Message”
--- By this command, we can update current commit message


INPUT – is a line of string as command
OUTPUT – Only with command 3 & 4 we can see the output.
