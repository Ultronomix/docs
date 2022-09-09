
public class Solution 
{
    public char validateWin(char[][] board) 
    {
    	/**
    	 * char[][] board = {{'X', 'O', 'X'},
                          {'O', 'O', 'O'},
                          {'X', 'X', 'O'}};
        Assert.assertEquals('O', new Solution().validateWin(board));
    	 */
    		
    	char returnChar = 'T';
    		
    		//3 senario from 0,0
	    	if((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') || (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'))
	    	{
	    		returnChar = board[0][0];
	    	}
	    	else if((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') || (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')) 
	    	{
	    		returnChar = board[0][0];
	    	}
	    	else if((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') || (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')) 
	    	{
	    		returnChar = board[0][0];
	    	}
	    	//1 senario from 1,0
	    	else if((board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') || (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')) 
	    	{
	    		returnChar = board[1][0];
	    	}
	    	// 2 senario from spot 2,0
	    	else if((board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') || (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')) 
	    	{
	    		returnChar = board[2][0];
	    	}
	    	else if((board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') || (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O')) 
	    	{
	    		returnChar = board[2][0];
	    	}
	    	// 1 senario from 0,1
	    	else if((board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')) 
	    	{
	    		returnChar = board[0][1];
	    	}
	    	//1 senario from 0,2
	    	else if((board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') || (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')) 
	    	{
	    		returnChar = board[0][2];
	    	}
    	
    	
    	
    	
        return returnChar;
    }
}
