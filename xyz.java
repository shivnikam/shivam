class xyz
{
	int i=20;
public Static void main(String args[])
{
	
	Bank b1=new Bank();
        b1.abcd();
	System.out.println("i value in Global Variable is " +i);
}
	
void abcd()
{
	int i=10;
        System.out.println("i value in Local Variable is " +i);
}	
	
}