// CLRS Dynamic programming solution

// two strings X and Y 
// Find Longest common substring between the two strings.

LCS-length(X,Y)
{
  int m = X.length();
  int n = Y.length();
  int[][] c = new int[m.length][n.length];
  int[][] b = new int[m.length][n.length];
  
  for(int i = 0;i<m.length;i++)
    c[i][0] = 0;
  for(int j =0;j<n.length;j++)
    c[0][j] = 0;
    
  for(i = 1;i<m;i++) {
    for(j=1;j<n;j++) {
      
      if(X.charAt(i)==Y.charAt(j))
        {
          c[i][j] = c[i-1][j-1] + 1;
          b[i][j] = "\";
        }
      else if(c[i-1][j] >= c[i][j-1])
        {
          c[i][j] = c[i-1][j];
          b[i][j] = "|";
        }
      else {
          c[i][j] = c[i][j-1];
          b[i][j] = "-";
        
      }
    
    }
  }


}

