import Widgets.Widget;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WidgetTest {
    public Widget widget;

    @Before
    public void startUp(){
       widget = new Widget();
    }

    @After
    public void stopTest(){
        widget = null;
    }

    @Test
    public void TestTheTest(){
        Assert.assertNotNull(widget);
    }

    @Test
    public void Widget_AddTwoNumbers_returnsResults(){

        //Arrange
        int a = 2;
        int b = 3;
        int expectedResult = 5;
        //Act
        int result = widget.add(a, b);

        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void Widget_AddTwoNumbersNested_returnsResults(){

        //Arrange
        int a = 2;
        int b = 3;
        int expectedResult = 10;

        //Act
        int result = widget.add(widget.add(a, b), 5);

        //Assert
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void Widget_Subtract2Numbers_returnsResults(){

        //Arrange
        int a = 2;
        int b = 3;
        int expectedResult = -1;

        //Act
        int result = widget.subtract(a, b);

        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void Widget_Subtract2NumbersNested_returnsResults(){

        //Arrange
        int a = 2;
        int b = 3;
        int expectedResult = -10;

        //Act
        int result = widget.subtract( widget.subtract(a, b) , 9);

        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void Widget_Concatenate_2Strings(){
        //Arrange
        String a = "Thing1 ";
        String b = "Thing2";
        String expectedResult = "Thing1 Thing2";

        //Act
        String result =  widget.concatenate(a, b) ;

        //Assert
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void Widget_ConcatenateNested_2Strings(){
        //Arrange
        String a = "Thing1 ";
        String b = "Thing2";
        String expectedResult = "Thing1 Thing2 Thing3";

        //Act
        String result =  widget.concatenate(widget.concatenate(a, b)," Thing3") ;

        //Assert
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void Widget_ConcatenateArray_1String(){
        //Arrange
        String[] stringArray = { "Thing1", "Thing2","Thing3"};
        String expectedResult = "Thing1Thing2Thing3";

        //Act
        String result =  widget.concatenate(stringArray) ;

        //Assert
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void Widget_ConcatenateArrayWithSeparator_1String(){
        //Arrange
        String[] stringArray = { "Thing1", "Thing2","Thing3"};
        String expectedResult = "Thing1 Thing2 Thing3";

        //Act
        String result =  widget.concatenate(stringArray," ") ;
        String newResult = mySecretMethod();
        //Assert
        Assert.assertEquals(expectedResult, result);
        expectedResult= "Secret Stuff";
        Assert.assertEquals(expectedResult, newResult);

    }

    private String mySecretMethod(){
        return "Secret Stuff";
    }
}
