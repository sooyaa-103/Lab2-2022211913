import org.junit.Assert;
import org.junit.Test;
public class L2022211913_10_Test {
    // 测试用的主类
    Solution10 solution = new Solution10();

    /**
     * 测试目的：测试两个简单的分数相加
     * 测试用例：输入 "1/2+1/2"，输出应该为 "1/1"。
     */
    @Test
    public void testSimpleAddition() {
        String expression = "1/2+1/2";
        String expected = "1/1";
        Assert.assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试两个简单的分数相减
     * 测试用例：输入 "1/2-1/3"，输出应该为 "1/6"。
     */
    @Test
    public void testSimpleSubtraction() {
        String expression = "1/2-1/3";
        String expected = "1/6";
        Assert.assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试包含加法和减法的复杂表达式
     * 测试用例：输入 "-1/2+1/3"，输出应该为 "-1/6"。
     */
    @Test
    public void testMixedOperations() {
        String expression = "-1/2+1/3";
        String expected = "-1/6";
        Assert.assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试结果为整数的情况
     * 测试用例：输入 "2/1+1/1"，输出应该为 "3/1"。
     */
    @Test
    public void testResultAsInteger() {
        String expression = "2/1+1/1";
        String expected = "3/1";
        Assert.assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试分子为0的情况
     * 测试用例：输入 "-1/2+1/2"，输出应该为 "0/1"。
     */
    @Test
    public void testZeroNumerator() {
        String expression = "-1/2+1/2";
        String expected = "0/1";
        Assert.assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试多项分数加减运算
     * 测试用例：输入 "-1/2+1/2+1/3"，输出应该为 "1/3"。
     */
    @Test
    public void testMultipleFractions() {
        String expression = "-1/2+1/2+1/3";
        String expected = "1/3";
        Assert.assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试分母为1的情况
     * 测试用例：输入 "1/1-1/2"，输出应该为 "1/2"。
     */
    @Test
    public void testDenominatorOne() {
        String expression = "1/1-1/2";
        String expected = "1/2";
        Assert.assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试分子和分母的极端情况
     * 测试用例：输入 "1/10+9/10"，输出应该为 "1/1"。
     */
    @Test
    public void testEdgeCase() {
        String expression = "1/10+9/10";
        String expected = "1/1";
        Assert.assertEquals(expected, solution.fractionAddition(expression));
    }
}
