package matrix;

public class Teams {
	public static void main(String[] args) {
		// String name = ""; //스칼라
		// 백터화 String[] team1 = ;
		String[][] team5 = { { "대엽", "동준", "기웅", "지현", }, 
					{ "민수", "철수", "동수", "윤수" }, 
					{ "신형", "재선", "성주", "태양" },
					{ "스칼렛", "스페셜", "세랄", "닙" } }; // 디멘션의 '확-장'
		for (int i = 0; i < team5.length; i++) {
			for (int j = 0; j < team5[i].length; j++) {
				System.out.printf("%s\t", team5[i][j]);
			}
			System.out.println();
		}
	}
}
