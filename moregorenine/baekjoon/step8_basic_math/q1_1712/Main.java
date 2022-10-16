package baekjoon.step8_basic_math.q1_1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            final int fixedCost = Integer.parseInt(st.nextToken());
            final int variableCost = Integer.parseInt(st.nextToken());
            final int salesPrice = Integer.parseInt(st.nextToken()); // 판매가
            int productionCnt = 0; // 생산 제품 갯수
            int profit = salesPrice - variableCost;

            if (profit <= 0) {
                productionCnt = -1;
            } else {
                productionCnt = (fixedCost / profit) + 1;
            }
            System.out.printf("%d", productionCnt);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            br.close();
        }

    }

}
