

public class Main 
{
    public static void main(String[] args) 
    {
    	Solution test = new Solution();
    	char[][] board1 = {{'X', 'X', 'X'}, {'O', 'X', 'O'}, {'O', 'O', 'X'}};
    	char[][] board2 = {{'X', 'O', 'X'}, {'X', 'O', 'O'}, {'X', 'X', 'O'}};
    	char[][] board3 = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'O', 'O', 'X'}};
    	char[][] board4 = {{'X', 'O', 'X'}, {'O', 'O', 'O'}, {'X', 'X', 'O'}};
    	char[][] board5 = {{'X', 'O', 'O'}, {'O', 'X', 'O'}, {'X', 'X', 'O'}};
    	char[][] board6 = {{'O', 'O', 'X'}, {'O', 'O', 'X'}, {'X', 'X', 'O'}};
    	char[][] board7 = {{'X', 'O', 'X'}, {'O', 'O', 'X'}, {'X', 'X', 'O'}};
    	
    	
    	System.out.println(test.validateWin(  board1));
    	System.out.println(test.validateWin(  board2));
    	System.out.println(test.validateWin(  board3));
    	System.out.println(test.validateWin(  board4));
    	System.out.println(test.validateWin(  board5));
    	System.out.println(test.validateWin(  board6));
    	System.out.println(test.validateWin(  board7));
    }
}