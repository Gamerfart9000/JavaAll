package homewrk;

import java.util.ArrayList;

class MemberInfo {
	private String name;
	private int gradYear;
	private boolean goodStanding;

	public MemberInfo(String name, int gradYear, boolean goodStanding) {
		this.name = name;
		this.gradYear = gradYear;
		this.goodStanding = goodStanding;
	}

	public String getName() {
		return name;
	}

	public int getGradYear() {
		return gradYear;
	}

	public boolean inGoodStanding() {
		return goodStanding;
	}
}

public class Hw4 {
	private ArrayList<MemberInfo> memberList;

	public Hw4() {
		memberList = new ArrayList<MemberInfo>();
	}

	/**
	 * Adds new club members to memberList. Precondition: names is a non-empty
	 * array.
	 */
	public void addMembers(String[] names, int gradYear) {
		for (String name : names) {
			memberList.add(new MemberInfo(name, gradYear, true));
		}
	}

	/**
	 * Removes members who have graduated and returns a list of members who have
	 * graduated and are in good standing.
	 */
	public ArrayList<MemberInfo> removeMembers(int year) {
		ArrayList<MemberInfo> graduated = new ArrayList<MemberInfo>();

		// Go backwards so removing elements doesn't skip anything
		for (int i = memberList.size() - 1; i >= 0; i--) {
			MemberInfo member = memberList.get(i);

			if (member.getGradYear() <= year) {
				if (member.inGoodStanding()) {
					graduated.add(member);
				}

				memberList.remove(i);
			}
		}

		return graduated;
	}
}
