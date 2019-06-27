package fundamentals;

public class Eleven {
	public static void main(String[] ar)
	{
	char ch=ar[0].charAt(0);
	switch(ch)
	{
	case 'R': System.out.println("R->Red"); break;
	case 'B': System.out.println("B->Blue"); break;
	case 'G': System.out.println("G->Green"); break;
	case 'O': System.out.println("O->Orange"); break;
	case 'Y': System.out.println("Y->Yellow");  break;
	case 'W': System.out.println("W->White"); break;
	case 'r': System.out.println("R->Red"); break;
	case 'b': System.out.println("B->Blue"); break;
	case 'g': System.out.println("G->Green"); break;
	case 'o': System.out.println("O->Orange"); break;
	case 'y': System.out.println("Y->Yellow");  break;
	case 'w': System.out.println("W->White"); break;
	default: System.out.println("Invalid Code"); break;
	}
	}

}
