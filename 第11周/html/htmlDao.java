package dao;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vo.Hyperlink;
import vo.Picture;

public class htmlDao {
	public static ArrayList<Picture> inputPicture(String Str) {
		String PStr = Str;
		ArrayList<Picture> ListPicture = new ArrayList<Picture>();
		String PictureRex = "(?<=<img src=’)(.*?)(?=’/>)";
		Pattern PicturePattern = Pattern.compile(PictureRex);
		Matcher PictureMatcher = PicturePattern.matcher(PStr);
		while (PictureMatcher.find()) {
			Picture picture = new Picture(PictureMatcher.group());
			ListPicture.add(picture);
		}
		return ListPicture;
	}

	public static ArrayList<Hyperlink> inputHyperlink(String Str) {
		String PStr = Str;
		ArrayList<Hyperlink> ListHyperlink = new ArrayList<Hyperlink>();
		PStr = Str;
		String HyperlinkSiteRex = "(?<=<a href=’)(.*?)(?=’>)";
		Pattern HyperlinkSitePattern = Pattern.compile(HyperlinkSiteRex);
		Matcher HyperlinkSiteMatcher = HyperlinkSitePattern.matcher(PStr);
		while (HyperlinkSiteMatcher.find()) {
			String HyperlinkNameRex = "(?<=<a href=’" + HyperlinkSiteMatcher.group() + "’>)(.*?)(?=</a>)";
			Pattern HyperlinkNamePattern = Pattern.compile(HyperlinkNameRex);
			Matcher HyperlinkNameMatcher = HyperlinkNamePattern.matcher(PStr);
			if (HyperlinkNameMatcher.find()) {
				Hyperlink hyperlink = new Hyperlink(HyperlinkNameMatcher.group(), HyperlinkSiteMatcher.group());
				ListHyperlink.add(hyperlink);
			}
		}
		return ListHyperlink;
	}

	public static void display(ArrayList<Picture> ListPicture, ArrayList<Hyperlink> ListHyperlink) {
		System.out.print("网页中共" + ListPicture.size() + "个图片，文件名为：");
		for (Picture picture : ListPicture) {
			System.out.print(picture.toString());
		}
		System.out.println("\n网页中包含" + ListHyperlink.size() + "个超链接，超链接信息如下:");
		System.out.println("名称\t地址");

		for (Hyperlink hyperlink : ListHyperlink) {
			System.out.println(hyperlink.toString());
		}
	}
}
