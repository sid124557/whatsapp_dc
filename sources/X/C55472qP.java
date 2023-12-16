package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

@Deprecated
/* renamed from: X.2qP  reason: invalid class name and case insensitive filesystem */
public class C55472qP {
    public final C66663Mh A00;
    public final C48872fc A01;
    public final C48882fd A02;
    public final C55372qF A03;
    public final C55252q3 A04;
    public final C54542ot A05;
    public final AnonymousClass2EX A06;
    public final C621133n A07;

    public C42002Mk A00() {
        try {
            AnonymousClass2JN A022 = this.A03.A02();
            C59892xf r2 = new C59892xf(A022.A01);
            AnonymousClass2JA r1 = new AnonymousClass2JA(A022.A00);
            Log.i("axolotl loading identity key pair");
            return new C42002Mk(r2, r1);
        } catch (AnonymousClass24R unused) {
            throw new SQLiteException("Invalid public key stored in identities table");
        }
    }

    public C59472wy A01(C52122kv r3) {
        try {
            return new C59472wy(this.A07.A0A(AnonymousClass31S.A00(r3)).A00());
        } catch (IOException unused) {
            throw AnonymousClass0x9.A0i("serialize/deserialize failed from Session object");
        }
    }

    public void A02(C59892xf r4, C52122kv r5) {
        C47932e4 r2;
        if (r4 != null) {
            try {
                r2 = new C47932e4(AnonymousClass36G.A01(r4.A00.A00()));
            } catch (AnonymousClass23X unused) {
                throw AnonymousClass0x9.A0i("Conversion between ECPublicKey and CurvePublicKey should never fail");
            }
        } else {
            r2 = null;
        }
        this.A07.A0M(r2, AnonymousClass31S.A00(r5));
    }

    public void A03(C52122kv r10, C59472wy r11) {
        try {
            if (r11.A01.A00.aliceBaseKey_.A07().length != 0) {
                C621133n r8 = this.A07;
                C54562ov A002 = AnonymousClass31S.A00(r10);
                LinkedList A18 = AnonymousClass0x9.A18();
                Iterator it = r11.A00.iterator();
                while (it.hasNext()) {
                    A18.add(((C623634s) it.next()).A00);
                }
                C130546c9 A0G = C21351Bm.DEFAULT_INSTANCE.A0G();
                C170208Ch.A05(A18, C18320x8.A0D(A0G, r11.A01.A00));
                byte[] A1Z = C18290x4.A1Z(A0G);
                boolean A0Y = r8.A0N.A0Y(C58422vE.A02, 4009);
                C85284Fq A0C = r8.A0L.A0C();
                if (A0Y) {
                    C69833Yo Axl = A0C.Axl();
                    synchronized (r8.A0G) {
                        try {
                            r8.A0B.A02(A002, A1Z);
                            A0C.B25(new C70333aK(r8, A002, A1Z, 45));
                            Axl.A00();
                            Axl.close();
                            A0C.close();
                        } catch (Throwable th) {
                            Axl.close();
                            A0C.close();
                            throw th;
                        }
                    }
                    return;
                }
                try {
                    C69833Yo Axl2 = A0C.Axl();
                    try {
                        C55182pw r3 = r8.A0G;
                        synchronized (r3) {
                            try {
                                r8.A0B.A02(A002, A1Z);
                                r3.A04(new C59402wr(A1Z), A002);
                                Axl2.A00();
                            } catch (IOException e) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("axolotl storeSession for ");
                                A0o.append(A002);
                                C18260x0.A15(" failed to update", A0o, e);
                            }
                        }
                        Axl2.close();
                        A0C.close();
                    } catch (Throwable th2) {
                        Axl2.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        A0C.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } else {
                throw AnonymousClass002.A0C("Alice base key missing from session");
            }
        } catch (IOException e2) {
            throw new IllegalArgumentException("Cannot store invalid session", e2);
        }
    }

    public boolean A04() {
        Cursor A012;
        AnonymousClass4GK A0B = this.A04.A02.get();
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A0B).A03, "SELECT COUNT(*) as count FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0", "SignalPreKeyStore/hasUnsentPreKeys");
            if (A012.moveToNext()) {
                boolean A1S = AnonymousClass000.A1S(AnonymousClass0x2.A03(A012));
                A012.close();
                C18260x0.A1E("axolotl has unsent prekeys: ", C18280x3.A0f(A0B), A1S);
                return A1S;
            }
            throw new SQLiteException("Unable to count unsent entries in prekeys table");
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C55472qP(C66663Mh r2, AnonymousClass2ZK r3, C55372qF r4, C55252q3 r5, C59382wp r6, C54542ot r7, C51162jN r8, C621133n r9, C48972fm r10) {
        this.A00 = r2;
        this.A07 = r9;
        this.A05 = r7;
        this.A02 = new C48882fd(r6, r9, r10);
        this.A06 = new AnonymousClass2EX(r8);
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = new C48872fc(r3, r9, r10);
    }
}
