package dreamschool.cscourse.workshop01;

import java.util.Scanner;

// 문제 4.
// 커피 주문을 하려고 한다.
// 메뉴를 보고, 각 메뉴 별로 몇 개씩 주문할 것인지 입력 받아 지불해야 할 총 금액을 계산해 보자.
// 그리고 총 금액이 일정 금액을 넘어서면 포인트를 적립해 준다.
// 총 금액 12000원 이상 : 구매 금액의 1% 적립
// 총 금액 30000원 이상 : 구매 금액의 2% 적립
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= 메뉴 =========" );
        System.out.println( " 1. 아메리카노   2000원" );
        System.out.println( " 2. 카페라떼   3000원" );
        System.out.println( " 3. 베이글   1500원" );
        System.out.println( " 4. 크림치즈   500원\n" );
        
        System.out.println( "========= 주문 =========" );
        System.out.print( " 아메리카노 주문 수량 : " );
        int 아메리카노 = getUserInput();
        
        System.out.print( " 카페라떼 주문 수량 : " );
        int 카페라떼 = getUserInput();
        
        System.out.print( " 베이글 주문 수량 : " );
        int 베이글 = getUserInput();
        
        System.out.print( " 크림치즈 주문 수량 : " );
        int 크림치즈 = getUserInput();
       
        int 아메리카노총액 = 2000 * 아메리카노;
        int 카페라떼총액 = 3000 * 카페라떼;
        int 베이글총액 = 1500 * 베이글;
        int 크림치즈총액 = 500 * 크림치즈;
        int 총액 = 아메리카노총액 + 카페라떼총액 + 베이글총액 + 크림치즈총액;
        
        System.out.println("========금액=========");
        System.out.println(2000 * 아메리카노);
        System.out.println(3000 * 카페라떼);
        System.out.println(1500 * 베이글);
        System.out.println(500 * 크림치즈);
        
        System.out.println("=================");
        System.out.println("총 구매 금액 : " + 총액);
        if(총액 >= 30000) {
        	System.out.println("포인트 적립 : " + (총액 * 0.02) + "점");
        }else if(총액 < 30000 &&  총액 >= 12000) {
        	System.out.println("포인트 적립 : " + (총액 * 0.01) + "점");
        }else {
        	System.out.println("포인트 적립 : 0점");
        }
        
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}

