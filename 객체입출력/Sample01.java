package ��ü�����;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class Sample01 {

	public static void main(String[] args) throws Exception {

		writeList();

		List<Board> list = readList();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (Board b : list) {
			System.out.println(b.getBno() + "\t" + b.getTitle() + "\t" + b.getContent() + "\t" + b.getWriter() + "\t"
					+ sdf.format(b.getDate()));
		}
	}

	public static void writeList() throws Exception {

		List<Board> list = new ArrayList<>();

		list.add(new Board(1, "java", "��ü����", "���ڹ�", new Date()));
		list.add(new Board(2, "c", "��������", "�ھ�", new Date()));
		list.add(new Board(3, "jsp", "����", "�ּ���", new Date()));

		FileOutputStream fos = new FileOutputStream("board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(list);

		oos.flush();
		oos.close();
		fos.close();
	}

	public static List<Board> readList() throws Exception {

		FileInputStream fis = new FileInputStream("board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);

		List<Board> list = (List<Board>) ois.readObject();

		ois.close();
		fis.close();

		return list;
	}
}
