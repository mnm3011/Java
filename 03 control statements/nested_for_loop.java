class nested_for_loop 
{
	public static void main(String[] args) 
	{
		int i=0;
			for(int k=0;k<5;k++)              // ROWS
			{
				for(;i<9;i++)					// COLUMNS
				{
					System.out.print(+i);
				}
				for(;i>0;i--)
				{
					System.out.print(+i);
				}
				System.out.println("");
			}	
	}
}
