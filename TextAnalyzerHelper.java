/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyzer;

/**
 *
 * @author chinmay-kulkarni-ubuntu
 */
public class TextAnalyzerHelper {

    /**
     * @param args the command line arguments
     */
    private String inputtedText;
    private int textLength;
    private int wordCount;
    private int tabCount;
    private int spaceCount;
    private int lineCount;
    private String uniqueCharString = "";

    public TextAnalyzerHelper(String inputtedText) {
        this.inputtedText = inputtedText;
        analyzeText();
    }

   // public String getInputtedText() {
   //     return inputtedText;
   // }

    public int getTextLength() {
        return textLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getTabCount() {
        return tabCount;
    }

    public int getSpaceCount() {
        return spaceCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public String getUniqueCharString() {
        return uniqueCharString;
    }
    
    public int  getTextOrCharCount(String pattern){
        return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TextAnalyzerHelper sample=new TextAnalyzerHelper("ajndf \t \n ajfnjanfj");
        System.out.print(sample);
        
    }
    private void analyzeText(){
        textLength=inputtedText.length();
        lineCount= textLength>0?inputtedText.split("\n",-1).length:0;
        spaceCount=inputtedText.split("\s",-1).length-1;
        tabCount=inputtedText.split("\t",-1).length-1;
      //  wordCount=inputtedText.split("\t",-1).length;
      
    }

    @Override
    public String toString() {
        return "TextAnalyzerHelper{" + "inputtedText=" + inputtedText + ", textLength=" + textLength + ", wordCount=" + wordCount + ", tabCount=" + tabCount + ", spaceCount=" + spaceCount + ", lineCount=" + lineCount + ", uniqueCharString=" + uniqueCharString + '}';
    }
    
    
}
