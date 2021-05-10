package Driver;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.htmlDao;
import vo.Hyperlink;
import vo.Picture;

public class htmlDriver {

	public static void main(String[] args) {
		String str="<html><head><title>��ӭ�����人��֯��ѧ��ҳ</title></head></html>"
				+ "<body><img src=��1.jpg��/>"
				+ "<a href=��1.htm��>��ҳ</a>"
				+ "<a href=��2.htm��>����</a>"
				+ "<a href=��3.htm��>����ѧԺ</a>"
				+ "<img src=��2.jpg��/>"
				+ "<img src=��3.jpg��/> </body></html>";
		String TitleRex="(?<=<title>)(.*?)(?=</title>)";
		Pattern TitlePattern=Pattern.compile(TitleRex);
		Matcher TitleMatcher=TitlePattern.matcher(str);
		if(TitleMatcher.find())
			System.out.println("��ҳ����:"+TitleMatcher.group());
		htmlDao HD=new htmlDao();
		ArrayList<Picture> ListPicture=HD.inputPicture(str);
		ArrayList<Hyperlink> ListHyperlink = HD.inputHyperlink(str);
		HD.display(ListPicture, ListHyperlink);
	}

}
