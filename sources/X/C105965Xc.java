package X;

/* renamed from: X.5Xc  reason: invalid class name and case insensitive filesystem */
public final class C105965Xc {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    public C105965Xc(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = -1;
        this.A0C = false;
        this.A05 = z;
        this.A02 = z2;
        this.A0D = z3;
        this.A0A = z4;
        this.A04 = z5;
        this.A03 = z6;
        this.A06 = false;
        this.A0B = false;
        this.A08 = true;
        this.A07 = false;
        this.A09 = false;
        this.A01 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C105965Xc) {
                C105965Xc r5 = (C105965Xc) obj;
                if (!(this.A00 == r5.A00 && this.A0C == r5.A0C && this.A05 == r5.A05 && this.A02 == r5.A02 && this.A0D == r5.A0D && this.A0A == r5.A0A && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A06 == r5.A06 && this.A0B == r5.A0B && this.A08 == r5.A08 && this.A07 == r5.A07 && this.A09 == r5.A09 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01((37893873 + this.A00) * 31, this.A0C), this.A05), this.A02), this.A0D), this.A0A), this.A04), this.A03), this.A06), this.A0B), this.A08), this.A07), this.A09), this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommunitySubgroupViewOptions(showParticipating=");
        A0o.append(true);
        A0o.append(", showNonParticipating=");
        A0o.append(true);
        A0o.append(", showAuxiliaryViews=");
        A0o.append(true);
        A0o.append(", subgroupLimit=");
        A0o.append(this.A00);
        A0o.append(", updateLastSeenOnInit=");
        A0o.append(this.A0C);
        A0o.append(", showDescription=");
        A0o.append(this.A05);
        A0o.append(", showActions=");
        A0o.append(this.A02);
        A0o.append(", useUpdatedDesign=");
        A0o.append(this.A0D);
        A0o.append(", showInviteLink=");
        A0o.append(this.A0A);
        A0o.append(", showCagInGroupsSection=");
        A0o.append(this.A04);
        A0o.append(", showAddGroup=");
        A0o.append(this.A03);
        A0o.append(", showEditActions=");
        A0o.append(this.A06);
        A0o.append(", showViewGroups=");
        A0o.append(this.A0B);
        A0o.append(", showGroupsSection=");
        A0o.append(this.A08);
        A0o.append(", showEmptyGroupsUpsellSection=");
        A0o.append(this.A07);
        A0o.append(", showInlineMembersSection=");
        A0o.append(this.A09);
        A0o.append(", isShowMemberSuggestedGroups=");
        return C18260x0.A0A(A0o, this.A01);
    }

    public C105965Xc() {
        this(true, true, false, true, true, true);
    }
}
