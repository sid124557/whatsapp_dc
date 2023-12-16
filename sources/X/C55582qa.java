package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.2qa  reason: invalid class name and case insensitive filesystem */
public class C55582qa {
    public boolean A00 = false;
    public final C56972sr A01;
    public final C29411im A02;
    public final C64773Ex A03;
    public final AnonymousClass33p A04;
    public final C56982ss A05;
    public final C56892sj A06;
    public final AnonymousClass4FV A07;
    public final C66503Lr A08;
    public final AnonymousClass31C A09;
    public final AnonymousClass4FS A0A;
    public final Set A0B = AnonymousClass002.A0K();
    public final Set A0C = AnonymousClass002.A0K();

    public final void A00() {
        if (!this.A00) {
            this.A00 = true;
            this.A0C.addAll(AnonymousClass0x2.A0F(this.A04).getStringSet("group_ack_unsent_gjids", AnonymousClass002.A0K()));
        }
    }

    public final void A01() {
        AnonymousClass33p r0 = this.A04;
        C18300x5.A15(C18270x1.A03(r0), "group_ack_unsent_gjids", this.A0C);
    }

    public void A02(AnonymousClass2OD r4, GroupJid groupJid) {
        boolean add;
        Set set = this.A0B;
        synchronized (set) {
            add = set.add(groupJid.getRawString());
        }
        Set set2 = this.A0C;
        synchronized (set2) {
            A00();
            if (set2.add(groupJid.getRawString())) {
                A01();
            }
        }
        if (add) {
            C70343aL.A01(this.A0A, this, groupJid, r4, 25);
        }
    }

    public void A03(AnonymousClass2OD r18, GroupJid groupJid, int i) {
        AnonymousClass2OD r5 = r18;
        GroupJid groupJid2 = groupJid;
        int i2 = i;
        if (i > 0) {
            C29411im r6 = this.A02;
            if (!AnonymousClass000.A1U(r6.A04, 2)) {
                r6.A06(new C64153Ch(r5, this, groupJid2, i2));
                return;
            }
        } else if (i == 0 && r5.A02 == null) {
            r5.A02 = Boolean.valueOf(this.A01.A0a(this.A03.A0D(groupJid2)));
        }
        AnonymousClass1Z0 r2 = new AnonymousClass1Z0();
        r2.A01 = Integer.valueOf(r5.A00);
        r2.A02 = Integer.valueOf(r5.A01);
        r2.A00 = r5.A02;
        r2.A03 = AnonymousClass0x9.A0m(i2);
        this.A07.BhD(r2);
        if (i <= 0 || A04(groupJid2)) {
            AnonymousClass31C r9 = this.A09;
            String A032 = r9.A03();
            String rawString = groupJid2.getRawString();
            AnonymousClass36K A0H = AnonymousClass36K.A0H("ack");
            AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
            AnonymousClass39V.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
            AnonymousClass39V.A05("xmlns", "w:g2", A1W);
            AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W);
            AnonymousClass36K A0E = AnonymousClass36K.A0E(A0H, "to", rawString, A1W);
            C72183dJ r62 = new C72183dJ();
            if (!r9.A0L(new AnonymousClass4KQ(r62, 4), A0E, A032, 388, 32000, false)) {
                r62.BQr(AnonymousClass002.A0C("connection layer not ready yet"));
            }
            try {
                AnonymousClass36K r63 = (AnonymousClass36K) r62.get();
                if (!"result".equals(AnonymousClass36K.A0L(r63, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
                    int A012 = C57492tj.A01(r63);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("AcknowledgeGroupHelper got error ");
                    A0o.append(A012);
                    C18260x0.A1S(A0o, " sending IQ for ", groupJid2);
                    if (A012 >= 400 && A012 < 500) {
                    }
                    if (i2 >= 7) {
                        Set set = this.A0B;
                        synchronized (set) {
                            set.remove(groupJid2.getRawString());
                        }
                        return;
                    }
                    GroupJid groupJid3 = groupJid2;
                    this.A0A.Bkn(new C71433c6(this, groupJid3, r5, i2, 18), "AcknowledgeGroupHelper.sendIqWithRetries", (long) (2500 << i));
                    return;
                }
            } catch (Exception e) {
                Log.w(AnonymousClass000.A0P(groupJid2, "AcknowledgeGroupHelper failed sending IQ for ", AnonymousClass001.A0o()), e);
            }
        }
        Set set2 = this.A0B;
        synchronized (set2) {
            set2.remove(groupJid2.getRawString());
        }
        Set set3 = this.A0C;
        synchronized (set3) {
            A00();
            if (set3.remove(groupJid2.getRawString())) {
                A01();
            }
        }
    }

    public boolean A04(GroupJid groupJid) {
        int i;
        AnonymousClass31A A002 = C56982ss.A00(this.A05, groupJid);
        if (!this.A06.A0C(groupJid) || A002 == null) {
            return false;
        }
        synchronized (A002) {
            i = A002.A04;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public C55582qa(C56972sr r2, C29411im r3, C64773Ex r4, AnonymousClass33p r5, C56982ss r6, C56892sj r7, AnonymousClass4FV r8, C66503Lr r9, AnonymousClass31C r10, AnonymousClass4FS r11) {
        this.A01 = r2;
        this.A0A = r11;
        this.A05 = r6;
        this.A07 = r8;
        this.A09 = r10;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A08 = r9;
        this.A06 = r7;
    }
}
