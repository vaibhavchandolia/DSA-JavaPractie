public class changebill {
    int fiveCount = 0;
    int tenCount = 0;

    for (int i = 0; i < n; i++) 
    {
  
        if (bills[i] == 50)
            fiveCount++;
        else if (bills[i] == 100) 
        {
  
            if (fiveCount > 0) 
            {
                fiveCount--;
                tenCount++;
            }
            else
                return "false";
        }
        else 
        {
 
            if (fiveCount > 0 && 
                tenCount > 0) 
            {
                fiveCount--;
                tenCount--;
            }

            else if (fiveCount >= 3) 
            {
                fiveCount -= 3;
            }
            else
                return "false";
        }
    }
  
    return "true";
}
  
}
