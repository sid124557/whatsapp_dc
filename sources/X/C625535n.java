package X;

import android.database.sqlite.SQLiteException;
import android.util.LruCache;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/* renamed from: X.35n  reason: invalid class name and case insensitive filesystem */
public class C625535n {
    public static final Random A06 = AnonymousClass0x9.A1C();
    public final LruCache A00 = new LruCache(100);
    public final C55682qk A01;
    public final C55472qP A02;
    public final C56612sH A03;
    public final C48972fm A04;
    public final AnonymousClass1VX A05;

    public static final C48472ex A00(Exception exc, byte[] bArr, int i) {
        int length;
        String str;
        if (exc != null) {
            Log.w("axolotl", exc);
        }
        if (i == 0) {
            if (bArr == null || (length = bArr.length) == 0) {
                Log.w("SignalCoordinator/createDecryptionResult axolotl derived null or empty plaintext from message");
                i = -1000;
            } else {
                byte b = bArr[length - 1] & 255;
                if (b == 0) {
                    str = "MessageUtil/removePadding/ axolotl derived plaintext has invalid padding";
                } else if (b >= length) {
                    str = "MessageUtil/removePadding/ axolotl derived entire plaintext as padding";
                } else {
                    int i2 = length - b;
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    if (bArr2.length != 0) {
                        return new C48472ex(bArr2, 0);
                    }
                    i = -10000;
                }
                Log.w(str);
                i = -10000;
            }
        } else if (exc != null) {
            exc.getMessage();
        }
        return new C48472ex((byte[]) null, i);
    }

    public static final boolean A01(AnonymousClass1CW r2, AnonymousClass1CW r3) {
        C21341Bl r0 = r2.localFingerprint_;
        if (r0 == null) {
            r0 = C21341Bl.DEFAULT_INSTANCE;
        }
        byte[] A07 = r0.content_.A07();
        C21341Bl r02 = r3.localFingerprint_;
        if (r02 == null) {
            r02 = C21341Bl.DEFAULT_INSTANCE;
        }
        if (MessageDigest.isEqual(A07, r02.content_.A07())) {
            C21341Bl r03 = r2.localFingerprint_;
            if (r03 == null) {
                r03 = C21341Bl.DEFAULT_INSTANCE;
            }
            byte[] A072 = r03.identifier_.A07();
            C21341Bl r04 = r3.localFingerprint_;
            if (r04 == null) {
                r04 = C21341Bl.DEFAULT_INSTANCE;
            }
            if (MessageDigest.isEqual(A072, r04.identifier_.A07())) {
                C21341Bl r05 = r2.remoteFingerprint_;
                if (r05 == null) {
                    r05 = C21341Bl.DEFAULT_INSTANCE;
                }
                byte[] A073 = r05.content_.A07();
                C21341Bl r06 = r3.remoteFingerprint_;
                if (r06 == null) {
                    r06 = C21341Bl.DEFAULT_INSTANCE;
                }
                if (MessageDigest.isEqual(A073, r06.content_.A07())) {
                    C21341Bl r07 = r2.remoteFingerprint_;
                    if (r07 == null) {
                        r07 = C21341Bl.DEFAULT_INSTANCE;
                    }
                    byte[] A074 = r07.identifier_.A07();
                    C21341Bl r08 = r3.remoteFingerprint_;
                    if (r08 == null) {
                        r08 = C21341Bl.DEFAULT_INSTANCE;
                    }
                    if (!MessageDigest.isEqual(A074, r08.identifier_.A07())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A02(AnonymousClass1CW r2, AnonymousClass1CW r3) {
        C21341Bl r0 = r2.localFingerprint_;
        if (r0 == null) {
            r0 = C21341Bl.DEFAULT_INSTANCE;
        }
        byte[] A07 = r0.content_.A07();
        C21341Bl r02 = r3.remoteFingerprint_;
        if (r02 == null) {
            r02 = C21341Bl.DEFAULT_INSTANCE;
        }
        if (MessageDigest.isEqual(A07, r02.content_.A07())) {
            C21341Bl r03 = r2.localFingerprint_;
            if (r03 == null) {
                r03 = C21341Bl.DEFAULT_INSTANCE;
            }
            byte[] A072 = r03.identifier_.A07();
            C21341Bl r04 = r3.remoteFingerprint_;
            if (r04 == null) {
                r04 = C21341Bl.DEFAULT_INSTANCE;
            }
            if (MessageDigest.isEqual(A072, r04.identifier_.A07())) {
                C21341Bl r05 = r2.remoteFingerprint_;
                if (r05 == null) {
                    r05 = C21341Bl.DEFAULT_INSTANCE;
                }
                byte[] A073 = r05.content_.A07();
                C21341Bl r06 = r3.localFingerprint_;
                if (r06 == null) {
                    r06 = C21341Bl.DEFAULT_INSTANCE;
                }
                if (MessageDigest.isEqual(A073, r06.content_.A07())) {
                    C21341Bl r07 = r2.remoteFingerprint_;
                    if (r07 == null) {
                        r07 = C21341Bl.DEFAULT_INSTANCE;
                    }
                    byte[] A074 = r07.identifier_.A07();
                    C21341Bl r08 = r3.localFingerprint_;
                    if (r08 == null) {
                        r08 = C21341Bl.DEFAULT_INSTANCE;
                    }
                    if (!MessageDigest.isEqual(A074, r08.identifier_.A07())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] A03(byte[] bArr) {
        int nextInt = A06.nextInt(16) + 1;
        int length = bArr.length;
        int i = length + nextInt;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        Arrays.fill(bArr2, length, i, (byte) nextInt);
        return bArr2;
    }

    public AnonymousClass2KK A04() {
        try {
            AnonymousClass2JN A022 = this.A02.A03.A02();
            C59892xf r4 = new C59892xf(A022.A01);
            AnonymousClass2JA r1 = new AnonymousClass2JA(A022.A00);
            Log.i("axolotl loading identity key pair");
            byte b = (byte) 5;
            return new AnonymousClass2KK(new C48462ew(r1.A00, b), new C47932e4(new C51502jv(r4.A00.A00, b)));
        } catch (AnonymousClass24R unused) {
            throw new SQLiteException("Invalid public key stored in identities table");
        }
    }

    public AnonymousClass33L A05(C54562ov r8) {
        C55472qP r2 = this.A02;
        return new AnonymousClass33L(r2, r2, r2, r2.A06, new C52122kv(AnonymousClass31S.A01(r8), r8.A00));
    }

    public void A06() {
        C55472qP r7 = this.A02;
        int A032 = r7.A00.A03(C66663Mh.A17);
        int A002 = r7.A04.A00();
        if (A002 >= A032) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("skipping key generation because already more than ");
            A0o.append(A032);
            C18260x0.A1L(A0o, " are unsent");
            return;
        }
        while (true) {
            A032 -= A002;
            if (A032 > 0) {
                A002 = Math.min(A032, 50);
                int A003 = r7.A03.A00();
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("axolotl generating ");
                A0o2.append(A002);
                A0o2.append(" new prekeys starting from ");
                A0o2.append(A003);
                C18260x0.A1L(A0o2, " and recording them in the db");
                ArrayList A0s = AnonymousClass001.A0s();
                LinkedList A18 = AnonymousClass0x9.A18();
                int i = A003 - 1;
                for (int i2 = 0; i2 < A002; i2++) {
                    A18.add(new C59162wS(C616431q.A02(), ((i + i2) % 16777214) + 1));
                }
                Iterator it = A18.iterator();
                while (it.hasNext()) {
                    AnonymousClass1CZ r0 = ((C59162wS) it.next()).A00;
                    A0s.add(new AnonymousClass2JO(r0.id_, r0.A0F()));
                }
                r7.A07.A0W(A0s, ((A003 + A002) % 16777214) + 1);
            } else {
                return;
            }
        }
    }

    public C625535n(C55682qk r3, C55472qP r4, C56612sH r5, C48972fm r6, AnonymousClass1VX r7) {
        this.A03 = r5;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
    }
}
