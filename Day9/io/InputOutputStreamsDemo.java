package com.demo.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* *
 * 
 * An InputStreamReader is a bridge from byte streams to character streams:
 *  It reads bytes and decodes them into characters using a specified charset. 
 *  The charset that it uses may be specified by name or may be given explicitly,
 *   or the platform's default charset may be accepted.
 * 
 */

public class InputOutputStreamsDemo {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("abc.txt");

		FileOutputStream out = new FileOutputStream("output_abx_rohit.txt");

		int i;

		while ((i = in.read()) != -1) {

			out.write(i);

		}

		in.close();

		System.out.println("done..");

	}

}
