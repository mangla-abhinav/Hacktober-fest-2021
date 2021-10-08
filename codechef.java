/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	private static final int MAX = 1000000001;
	
	private static Boolean pairConflict(int[][] n, int a, int b, Integer[] horz, Integer[] vert, char[] direction, int distance) {
		if ((direction[a] == 'H') && (direction[b] == 'H')) {
			if (n[a][1] != n[b][1]) {return false;}
			if (Math.abs(n[a][0] - n[b][0]) >= 2 * distance) {return false;}
			else {return true;}
		}
		if ((direction[a] == 'H') && (direction[b] == 'V')) {
			if (Math.abs(n[a][0] - n[b][0]) >= distance) {return false;}
			if ((n[b][1] - distance >= n[a][1]) || (n[b][1] + distance <= n[a][1])) {
				return false;
			} else {return true;}
		}
        if ((direction[a] == 'V') && (direction[b] == 'H')) {
        	if (Math.abs(n[a][0] - n[b][0]) >= distance) {return false;}
			if ((n[a][1] - distance >= n[b][1]) || (n[a][1] + distance <= n[b][1])) {
				return false;
			} else {return true;}
		}
		if ((direction[a] == 'V') && (direction[b] == 'V')) {
			if (n[a][0] != n[b][0]) {return false;}
			if (Math.abs(n[a][0] - n[b][0]) >= 2 * distance) {return false;}
			else {return true;}
		}
		return false;
	}
	
	private static Boolean findConflict(int[][] n, int index, Integer[] horz, Integer[] vert, char[] direction, int distance) {
		if ((horz[index] < distance) && (vert[index] < distance)) {return true;}
		direction[index] = 'H';
		if (horz[index] >= distance) {
			for (int i = 0; i < index; i++) {
				if (pairConflict(n, i, index, horz, vert, direction, distance)) {
					direction[index]= 'V';
					break;
				}
			}
			if ((direction[index] == 'H') && (index < n.length - 1)) {
				if (findConflict(n, index + 1, horz, vert, direction, distance)) {
					direction[index] = 'V';
				}
			}
		} else {
			direction[index] = 'V';
		}
		if (direction[index] == 'V') {
			if (vert[index] < distance) {return true;}
			for (int i = 0; i < index; i++) {
				if (pairConflict(n, i, index, horz, vert, direction, distance)) {return true;}
			}
			if (index < n.length - 1) {
				return findConflict(n, index + 1, horz, vert, direction, distance);
			}
		}
		return false;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String instr = reader.readLine();
		if (instr == null) {return;}
		int numTests = Integer.parseInt(instr);
		int test = 0;
		List<Integer> distances = new ArrayList<>();
		List<String> directions = new ArrayList<>();
		while (test < numTests) {
			int N = Integer.valueOf(reader.readLine());
			int[][] n = new int[N][2];
			for (int i = 0; i < N; i++) {
				n[i] = Arrays.stream(reader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			Integer[] horz = new Integer[n.length];
			Integer[] vert = new Integer[n.length];
			// Find horizontal and vertical limits
			for (int i = 0; i < n.length; i++) {
				horz[i] = MAX;
				vert[i] = MAX;
				for (int j = 0; j < n.length; j++) {
					if (i == j) {continue;}
					if ((n[i][0] != n[j][0]) && (n[i][1] != n[j][1])) {continue;}
					if (n[i][0] == n[j][0]) {
						int diff = Math.abs(n[i][1] - n[j][1]);
						if (vert[i] > diff) {
							vert[i] = diff;
						}
					}
					if (n[i][1] == n[j][1]) {
						int diff = Math.abs(n[i][0] - n[j][0]);
						if (horz[i] > diff) {
							horz[i] = diff;
						}
					}
				}
			}
			// Find smallest of longer of H/V distances
			int cd;
			int ncd = 0;
			int distance = MAX;  // Smallest of longer of H/V distances
			for (int i = 0; i < N; i++) {
				int larger = (vert[i] > horz[i])? vert[i]: horz[i];
				if (larger < distance) {distance = larger;}
			}
			char[] direction = new char[n.length];
			char[] dir = new char[n.length];
			for (int i = 0; i < n.length; i++) {
				direction[i] = 'N';
				dir[i] = 'N';
			}
			Boolean conflict = findConflict(n, 0, horz, vert, dir, distance);
			if (!conflict) {
				if (distance == MAX) {distance = -1;}
				if (distance > 0) { distance /= 2;}
				distances.add(distance);
				StringBuilder str = new StringBuilder();
	        	for (char ch: dir) {
					if (ch == 'H') {str.append('-');}
					else {str.append('|');}
				}
				directions.add(str.toString());
				test++;
				continue;
			} else {
				cd = distance;
				distance = (cd + ncd) / 2;
				for (int i = 0; i < n.length; i++) {
					dir[i] = 'N';
				}
			}
			while (cd - ncd > 1) {
				if (findConflict(n, 0, horz, vert, dir, distance)) {
					cd = distance;
					for (int i = 0; i < n.length; i++) {
						dir[i] = 'N';
					}
				} else {
					ncd = distance;
					for (int i = 0; i < n.length; i++) {
						direction[i] = dir[i];
					}
				}
				distance = (cd + ncd) / 2;
			} 
			distances.add(ncd);
			StringBuilder str = new StringBuilder();
        	for (char ch: direction) {
				if (ch == 'H') {str.append('-');}
				else {str.append('|');}
			}
			directions.add(str.toString());
			test++;
		}
		for (int i = 0 ; i < distances.size(); i++) {
			System.out.println(distances.get(i));
			System.out.println(directions.get(i));
		}
	}
}
