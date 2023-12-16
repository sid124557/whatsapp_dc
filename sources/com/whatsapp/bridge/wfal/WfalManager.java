package com.whatsapp.bridge.wfal;

import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass21S;
import X.AnonymousClass223;
import X.AnonymousClass2BX;
import X.AnonymousClass2Z5;
import X.AnonymousClass3QD;
import X.C162457s7;
import X.C166557yt;
import X.C18260x0;
import X.C18320x8;
import X.C183538qC;
import X.C56042rK;
import X.C56972sr;
import X.C58422vE;
import X.C60492ye;
import X.C614430u;
import X.C73153f1;
import android.content.SharedPreferences;

public final class WfalManager {
    public final C56972sr A00;
    public final AnonymousClass1VX A01;
    public final C614430u A02;
    public final AnonymousClass2Z5 A03;
    public final C56042rK A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;

    public final C166557yt A01(AnonymousClass223 r6) {
        String str;
        SharedPreferences A002;
        String str2;
        C162457s7.A0J(r6, 0);
        C614430u A0c = AnonymousClass0x9.A0c(this.A06);
        int ordinal = r6.ordinal();
        if (ordinal == 0) {
            str = "F";
        } else if (ordinal == 1) {
            str = "I";
        } else {
            throw C73153f1.A00();
        }
        if (!A0c.A08() || A0c.A07()) {
            return null;
        }
        if (C162457s7.A0P(str, "F")) {
            A002 = A0c.A00();
            str2 = "crossposting_destination_fb";
        } else if (!C162457s7.A0P(str, "I")) {
            return null;
        } else {
            A002 = A0c.A00();
            str2 = "crossposting_destination_ig";
        }
        String string = A002.getString(str2, (String) null);
        if (string != null) {
            return new C166557yt(AnonymousClass3QD.A00(), String.class, string, "WaffleCrosspostingDestination");
        }
        return null;
    }

    public final C60492ye A00() {
        return AnonymousClass0x9.A0c(this.A06).A01();
    }

    public final boolean A02() {
        if (this.A00.A0Y() || this.A04.A05(AnonymousClass21S.A0W)) {
            return false;
        }
        if (C18320x8.A0M(this.A05).A01(AnonymousClass2BX.A00) != null || this.A01.A0Y(C58422vE.A02, 538)) {
            return true;
        }
        return false;
    }

    public WfalManager(C56972sr r1, AnonymousClass1VX r2, C614430u r3, AnonymousClass2Z5 r4, C56042rK r5, C183538qC r6, C183538qC r7, C183538qC r8) {
        C18260x0.A0e(r3, r6, r7, r8);
        C18260x0.A0W(r1, r2, r5);
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
    }
}
