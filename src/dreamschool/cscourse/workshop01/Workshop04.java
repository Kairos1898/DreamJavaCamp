package dreamschool.cscourse.workshop01;

import java.util.Scanner;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int �Ƹ޸�ī�� = getUserInput();
        
        System.out.print( " ī��� �ֹ� ���� : " );
        int ī��� = getUserInput();
        
        System.out.print( " ���̱� �ֹ� ���� : " );
        int ���̱� = getUserInput();
        
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int ũ��ġ�� = getUserInput();
       
        int �Ƹ޸�ī���Ѿ� = 2000 * �Ƹ޸�ī��;
        int ī����Ѿ� = 3000 * ī���;
        int ���̱��Ѿ� = 1500 * ���̱�;
        int ũ��ġ���Ѿ� = 500 * ũ��ġ��;
        int �Ѿ� = �Ƹ޸�ī���Ѿ� + ī����Ѿ� + ���̱��Ѿ� + ũ��ġ���Ѿ�;
        
        System.out.println("========�ݾ�=========");
        System.out.println(2000 * �Ƹ޸�ī��);
        System.out.println(3000 * ī���);
        System.out.println(1500 * ���̱�);
        System.out.println(500 * ũ��ġ��);
        
        System.out.println("=================");
        System.out.println("�� ���� �ݾ� : " + �Ѿ�);
        if(�Ѿ� >= 30000) {
        	System.out.println("����Ʈ ���� : " + (�Ѿ� * 0.02) + "��");
        }else if(�Ѿ� < 30000 &&  �Ѿ� >= 12000) {
        	System.out.println("����Ʈ ���� : " + (�Ѿ� * 0.01) + "��");
        }else {
        	System.out.println("����Ʈ ���� : 0��");
        }
        
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}

