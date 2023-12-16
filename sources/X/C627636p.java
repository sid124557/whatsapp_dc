package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.36p  reason: invalid class name and case insensitive filesystem */
public class C627636p {
    public static C30331mH A09(C56972sr r4, C56612sH r5, AnonymousClass1VX r6, C52552lf r7, Collection collection) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                if (A0T != null && A0P(r4, A0T)) {
                    C624134x A08 = A08(r4, r5, r6, r7, A0T);
                    if (A08 instanceof C30331mH) {
                        return (C30331mH) A08;
                    }
                }
            }
        }
        return null;
    }

    public static AnonymousClass2z0 A0A(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C95814uZ A0S = C18310x6.A0S(bundle.getString("message_key_jid"));
        boolean z = bundle.getBoolean("message_key_from_me");
        String string = bundle.getString("message_key_id");
        if (A0S == null || string == null) {
            return null;
        }
        return AnonymousClass2z0.A05(A0S, string, z);
    }

    public static String A0D(byte b) {
        if (b != 0) {
            if (b == 7) {
                return "system";
            }
            if (b == 1 || b == 25 || b == 42) {
                return "image";
            }
            if (b == 82) {
                return "ptt";
            }
            if (b == 2) {
                return "audio";
            }
            if (b == 3 || b == 28 || b == 43) {
                return "video";
            }
            if (b != 13) {
                if (b == 4) {
                    return "vcard";
                }
                if (b != 5) {
                    if (b == 16) {
                        return "livelocation";
                    }
                    if (b != 9) {
                        if (b == 20) {
                            return "sticker";
                        }
                        if (b == 23) {
                            return "product";
                        }
                        if (b == 37) {
                            return "catalog";
                        }
                        if (b == 24) {
                            return "invite";
                        }
                        if (b != 26) {
                            if (b != 29) {
                                if (b != 30) {
                                    if (b == 45) {
                                        return "list";
                                    }
                                    if (b == 46) {
                                        return "list_response";
                                    }
                                    if (b == 52) {
                                        return "product_list";
                                    }
                                    if (b == 81) {
                                        return "ptv";
                                    }
                                }
                            }
                        }
                    }
                    return "document";
                }
                return "location";
            }
            return "gif";
        }
        return null;
    }

    public static boolean A0H(byte b) {
        return b == 1 || b == 23 || b == 37 || b == 2 || b == 3 || b == 81 || b == 13 || b == 9 || b == 20 || b == 25 || b == 26 || b == 28 || b == 29 || b == 57 || b == 62 || b == 63;
    }

    public static long A01(C624134x r5) {
        if (r5 == null || r5.A1L == 0) {
            return Long.MIN_VALUE;
        }
        return r5.A1M;
    }

    public static Bundle A02(AnonymousClass2z0 r3) {
        if (r3 == null) {
            return null;
        }
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("message_key_jid", C627336j.A07(r3.A00));
        A08.putBoolean("message_key_from_me", r3.A02);
        A08.putString("message_key_id", r3.A01);
        return A08;
    }

    public static AnonymousClass3ZH A03(C66473Lo r2, C624134x r3) {
        C95814uZ r1 = r3.A1J.A00;
        if (C627336j.A0K(r1) || (r1 instanceof C135166kE)) {
            r1 = r3.A0n();
        }
        if (r1 != null) {
            return r2.A01(r1);
        }
        return null;
    }

    public static C27991fJ A05(C624134x r1) {
        if (r1 instanceof C30941nT) {
            return AnonymousClass34R.A01(r1.A1J.A00);
        }
        return null;
    }

    public static UserJid A06(C56972sr r1, C624134x r2) {
        if (r2.A1J.A02) {
            return C56972sr.A04(r1);
        }
        return r2.A0o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r0 != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C624134x A08(X.C56972sr r8, X.C56612sH r9, X.AnonymousClass1VX r10, X.C52552lf r11, X.C624134x r12) {
        /*
            boolean r0 = r12 instanceof X.C30551md
            if (r0 == 0) goto L_0x003f
            r0 = r12
            X.1md r0 = (X.C30551md) r0
            int r0 = r0.A01
            if (r0 != 0) goto L_0x003f
            r0 = 4042(0xfca, float:5.664E-42)
            long r6 = X.C56952sp.A04(r10, r0)
            r1 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001b
            r6 = 300000(0x493e0, double:1.482197E-318)
        L_0x001b:
            boolean r1 = A0R(r8, r12)
            X.2z0 r5 = r12.A1J
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0027
            if (r1 == 0) goto L_0x0055
        L_0x0027:
            int r1 = r12.A0D
            r0 = 4
            int r0 = X.AnonymousClass358.A00(r1, r0)
            if (r0 >= 0) goto L_0x004e
            long r3 = r12.A0K
            long r3 = r3 + r6
            long r1 = r9.A0H()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            java.util.Map r1 = r11.A01
            monitor-enter(r1)
            goto L_0x0043
        L_0x003f:
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x001b
        L_0x0043:
            boolean r0 = r1.containsKey(r5)     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            goto L_0x004c
        L_0x0049:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            throw r0
        L_0x004c:
            if (r0 == 0) goto L_0x0054
        L_0x004e:
            boolean r0 = A0Y(r12)
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            return r12
        L_0x0055:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627636p.A08(X.2sr, X.2sH, X.1VX, X.2lf, X.34x):X.34x");
    }

    public static C40812Hv A0C(C56972sr r4, C56612sH r5, AnonymousClass1VX r6, C52552lf r7, C624134x r8) {
        C30331mH A09;
        C30331mH A092;
        C30331mH A093;
        C30331mH A094;
        C41842Lu r3 = new C41842Lu();
        C624134x A08 = A08(r4, r5, r6, r7, r8);
        if (A08 != null) {
            r3.A00 = A08;
        }
        AnonymousClass4FP r0 = r8.A0L;
        if (!(r0 == null || (A094 = A09(r4, r5, r6, r7, r0.B4S())) == null)) {
            r3.A01.add(A094);
        }
        if ((r8 instanceof C30451mT) && (A093 = A09(r4, r5, r6, r7, ((C30451mT) r8).A04)) != null) {
            r3.A01.add(A093);
        }
        C30331mH A095 = A09(r4, r5, r6, r7, Collections.singletonList(r8.A1S));
        if (A095 != null) {
            r3.A01.add(A095);
        }
        C30331mH A096 = A09(r4, r5, r6, r7, Collections.singletonList(r8.A1T));
        if (A096 != null) {
            r3.A01.add(A096);
        }
        if ((r8 instanceof AnonymousClass1nW) && (A092 = A09(r4, r5, r6, r7, Collections.singletonList(((AnonymousClass1nW) r8).A00))) != null) {
            r3.A01.add(A092);
        }
        if ((r8 instanceof C30461mU) && (A09 = A09(r4, r5, r6, r7, ((C30461mU) r8).A1v())) != null) {
            r3.A01.add(A09);
        }
        ArrayList A0J = AnonymousClass002.A0J(r3.A01);
        C624134x r1 = r3.A00;
        if (r1 != null) {
            A0J.add(0, r1);
        }
        return new C40812Hv(A0J);
    }

    public static boolean A0G(byte b) {
        if (b == 13 || b == 29) {
            return true;
        }
        return false;
    }

    public static boolean A0I(byte b) {
        if (b == 42 || b == 43) {
            return true;
        }
        return false;
    }

    public static boolean A0K(int i) {
        if (i == 12 || i == 127 || i == 79 || i == 20 || i == 126 || i == 123 || i == 90 || i == 93 || i == 106 || i == 124 || i == 144 || i == 149) {
            return true;
        }
        return false;
    }

    public static boolean A0M(C56972sr r2, C624134x r3) {
        AnonymousClass2z0 r1 = r3.A1J;
        if (r1.A02 || A0l(r3) || !C627336j.A0K(r1.A00)) {
            return false;
        }
        List list = r3.A18;
        if (list != null && C624435a.A05(r2, list)) {
            return true;
        }
        C624134x A0w = r3.A0w();
        if (A0w == null || !A0w.A1J.A02) {
            return false;
        }
        return true;
    }

    public static boolean A0N(C56972sr r2, C624134x r3) {
        boolean A0a;
        byte b = r3.A1I;
        if (b == 15) {
            A0a = r3.A1J.A02;
        } else if (b == 64) {
            A0a = r2.A0a(((C30961nV) r3).A00);
        } else if (b != 83 || r2.A0a(r3.A0Q)) {
            return false;
        } else {
            return true;
        }
        if (!A0a || r3.A1W) {
            return true;
        }
        return false;
    }

    public static boolean A0O(C56972sr r2, C624134x r3) {
        if (!(r3 instanceof C30341mI)) {
            return false;
        }
        int i = ((C30341mI) r3).A00;
        if (A0K(i) || i == 52) {
            return ((C31891p1) r3).A01.contains(C56972sr.A05(r2));
        }
        if (i == 4) {
            return C56972sr.A0A(r2, r3);
        }
        return false;
    }

    public static boolean A0P(C56972sr r2, C624134x r3) {
        if (r3.A01 != 8) {
            return r3.A1J.A02;
        }
        C95814uZ A0n = r3.A0n();
        if (A0n == null || r2.A0a(A0n)) {
            return true;
        }
        return false;
    }

    public static boolean A0Q(C56972sr r3, C624134x r4) {
        if (r4.A1J.A02) {
            if (!(r4 instanceof C30341mI)) {
                return true;
            }
            int i = ((C30341mI) r4).A00;
            if (!(i == 4 || i == 5 || i == 6 || i == 11 || i == 12 || i == 137 || i == 138)) {
                if (i != 143) {
                    if (i != 144) {
                        switch (i) {
                            case 1:
                            case 14:
                            case 17:
                            case 27:
                            case 90:
                            case 99:
                            case 106:
                            case 118:
                            case 131:
                                break;
                            case 20:
                            case 79:
                            case 101:
                                break;
                            default:
                                switch (i) {
                                    case 123:
                                    case 125:
                                    case 126:
                                        break;
                                    case 124:
                                    case 127:
                                        break;
                                    default:
                                        switch (i) {
                                            case 149:
                                            case 150:
                                            case 151:
                                            case 152:
                                                break;
                                        }
                                }
                        }
                    }
                }
                return ((C31891p1) r4).A01.contains(C56972sr.A05(r3));
            }
            return C56972sr.A0A(r3, r4);
        }
        return false;
    }

    public static boolean A0R(C56972sr r2, C624134x r3) {
        if (r3.A1J.A02 || r3.A1I != 64 || !r2.A0a(((C30961nV) r3).A00) || r3.A1W) {
            return false;
        }
        return true;
    }

    public static boolean A0T(C56972sr r3, C624134x r4) {
        AnonymousClass2z0 r2 = r4.A1J;
        if (!r2.A02 || r4.A0D == 6 || !r3.A0a(r2.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r2.A0Y(X.C58422vE.A02, r1) != false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x014b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c A[ADDED_TO_REGION, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0U(X.C66663Mh r7, X.AnonymousClass1VX r8, X.C624134x r9, X.C50222hp r10) {
        /*
            boolean r0 = r9 instanceof X.C30771mz
            r3 = 0
            if (r0 == 0) goto L_0x000d
            r0 = r9
            X.1mz r0 = (X.C30771mz) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return r3
        L_0x000d:
            boolean r0 = r9 instanceof X.C31951p9
            if (r0 == 0) goto L_0x0022
            r1 = 3482(0xd9a, float:4.88E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x000c
            X.2z0 r0 = r9.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0022
            return r3
        L_0x0022:
            boolean r0 = r9 instanceof X.C30821nD
            if (r0 != 0) goto L_0x000c
            boolean r0 = r9 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x0071
            X.4DV r9 = (X.AnonymousClass4DV) r9
            X.315 r4 = r10.A01(r9)
            if (r4 == 0) goto L_0x000c
            boolean r0 = r4 instanceof X.AnonymousClass1pO
            if (r0 != 0) goto L_0x005b
            boolean r0 = r4 instanceof X.AnonymousClass1pM
            if (r0 != 0) goto L_0x005b
            boolean r0 = r4 instanceof X.AnonymousClass1pP
            if (r0 == 0) goto L_0x0063
            X.1pP r4 = (X.AnonymousClass1pP) r4
            X.39W r2 = r4.A02
            X.39P r0 = r2.A03
            if (r0 == 0) goto L_0x004b
            int r1 = r0.A01
            r0 = 1
            if (r1 == r0) goto L_0x005b
        L_0x004b:
            java.lang.String r0 = r2.A0A
            if (r0 == 0) goto L_0x006e
            X.1VX r2 = r4.A00
            r1 = 4672(0x1240, float:6.547E-42)
        L_0x0053:
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x006e
        L_0x005b:
            X.20O r1 = X.AnonymousClass20O.ALL
        L_0x005d:
            X.20O r0 = X.AnonymousClass20O.NONE
            if (r1 == r0) goto L_0x000c
        L_0x0061:
            r3 = 1
            return r3
        L_0x0063:
            boolean r0 = r4 instanceof X.AnonymousClass1pK
            if (r0 == 0) goto L_0x006e
            X.1pK r4 = (X.AnonymousClass1pK) r4
            X.1VX r2 = r4.A00
            r1 = 2909(0xb5d, float:4.076E-42)
            goto L_0x0053
        L_0x006e:
            X.20O r1 = X.AnonymousClass20O.NONE
            goto L_0x005d
        L_0x0071:
            byte r1 = r9.A1I
            boolean r0 = A0J(r1)
            if (r0 != 0) goto L_0x000c
            r0 = 10
            if (r1 == r0) goto L_0x000c
            r0 = 11
            if (r1 == r0) goto L_0x000c
            r0 = 31
            if (r1 == r0) goto L_0x000c
            r0 = 12
            if (r1 == r0) goto L_0x000c
            boolean r0 = A0l(r9)
            if (r0 != 0) goto L_0x000c
            r9.A13()
            X.34w r0 = r9.A0P
            if (r0 != 0) goto L_0x000c
            boolean r0 = A0H(r1)
            if (r0 == 0) goto L_0x011b
            r1 = r9
            X.1mV r1 = (X.C30471mV) r1
            X.33C r4 = r1.A01
            if (r4 != 0) goto L_0x00aa
            java.lang.String r0 = "userActionForwardMessage/media_data is null"
        L_0x00a6:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x00aa:
            boolean r0 = r9 instanceof X.C31971pB
            if (r0 == 0) goto L_0x00bc
            r0 = r9
            X.1pC r0 = (X.C31981pC) r0
            boolean r0 = X.AnonymousClass35Z.A03(r0)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = r1.A03
            if (r0 != 0) goto L_0x011b
            return r3
        L_0x00bc:
            java.io.File r0 = r4.A0F
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "userActionForwardMessage/media_data.file is null"
            goto L_0x00a6
        L_0x00c4:
            boolean r0 = r4.A03()
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "userActionForwardMessage/media_data.file does not exist"
            goto L_0x00a6
        L_0x00ce:
            long r1 = r4.A0A
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00df
            java.io.File r0 = r4.A0F
            if (r0 == 0) goto L_0x00f5
            long r5 = r0.length()     // Catch:{ all -> 0x0186 }
            goto L_0x00f5
        L_0x00df:
            X.2z0 r0 = r9.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x011b
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x011b
            X.1Ei r0 = X.C66663Mh.A0Z
            boolean r0 = r7.A08(r0)
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "userActionForwardMessage/cannot forward partially uploaded message."
            goto L_0x0117
        L_0x00f5:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00df
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "userActionForwardMessage/original_size:"
            r2.append(r0)
            long r0 = r4.A0A
            r2.append(r0)
            java.lang.String r0 = " file_length:"
            r2.append(r0)
            java.io.File r0 = r4.A0F
            long r0 = r0.length()
            java.lang.String r0 = X.AnonymousClass001.A0k(r2, r0)
        L_0x0117:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r3
        L_0x011b:
            X.C162457s7.A0J(r8, r3)
            boolean r0 = r9 instanceof X.AnonymousClass1p5
            if (r0 == 0) goto L_0x014b
            r0 = r9
            X.1p5 r0 = (X.AnonymousClass1p5) r0
            X.2cm r0 = r0.A00
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x014b
            java.util.Iterator r2 = r0.iterator()
        L_0x012f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x014b
            java.lang.Object r1 = r2.next()
            X.2w3 r1 = (X.C58932w3) r1
            X.C162457s7.A0H(r1)
            boolean r0 = X.C625135j.A01(r8, r1)
            if (r0 != 0) goto L_0x000c
            boolean r0 = X.C625135j.A02(r8, r1)
            if (r0 == 0) goto L_0x012f
            return r3
        L_0x014b:
            X.2z0 r0 = r9.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 == 0) goto L_0x015b
            boolean r0 = r9 instanceof X.C30451mT
            r1 = 4338(0x10f2, float:6.079E-42)
            if (r0 == 0) goto L_0x016b
            r0 = 0
            return r0
        L_0x015b:
            boolean r0 = r1 instanceof X.C135216kJ
            if (r0 == 0) goto L_0x0172
            r1 = 1844(0x734, float:2.584E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0172
            r1 = 4033(0xfc1, float:5.651E-42)
        L_0x016b:
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            return r0
        L_0x0172:
            boolean r0 = A0k(r9)
            if (r0 != 0) goto L_0x000c
            boolean r0 = r9 instanceof X.AnonymousClass4BA
            if (r0 != 0) goto L_0x0061
            boolean r0 = r9 instanceof X.C30471mV
            if (r0 != 0) goto L_0x0061
            boolean r0 = r9 instanceof X.C30481mW
            if (r0 == 0) goto L_0x000c
            goto L_0x0061
        L_0x0186:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627636p.A0U(X.3Mh, X.1VX, X.34x, X.2hp):boolean");
    }

    public static boolean A0V(C64773Ex r3, C56982ss r4, C56892sj r5, C624134x r6) {
        AnonymousClass3ZH A09;
        C28011fL r0;
        AnonymousClass3ZH A092;
        if ((r6 instanceof C30331mH) && ((C30331mH) r6).A1z()) {
            C95814uZ r1 = r6.A1J.A00;
            if (C627336j.A0K(r1)) {
                C27991fJ A01 = AnonymousClass34R.A01(r1);
                if (r4.A06(A01) == 3 && (A092 = r3.A09(A01)) != null && A092.A0k && r4.A0O(A01)) {
                    return true;
                }
            }
        } else if (r6 == null) {
            return false;
        }
        C95814uZ r12 = r6.A1J.A00;
        if ((r12 instanceof C28011fL) && (r0 = (C28011fL) r12) != null && r5.A0B(r0)) {
            return true;
        }
        if (!C624134x.A0g(r6) || !C627336j.A0K(r12)) {
            return false;
        }
        C27991fJ A03 = AnonymousClass34R.A03(r12);
        if (r4.A06(A03) != 3 || (A09 = r3.A09(A03)) == null || !A09.A0k || !r4.A0O(A03)) {
            return false;
        }
        return true;
    }

    public static boolean A0X(C624134x r3) {
        byte b = r3.A1I;
        if ((b == 2 && (r3.A09 == 1 || AnonymousClass2z0.A0C(r3) || r3.A0z() != null)) || A0I(b) || b == 82 || b == 78 || b == 81) {
            return true;
        }
        return false;
    }

    public static boolean A0Y(C624134x r2) {
        int i = r2.A0D;
        if (i == 7 || i == 20 || i == 21) {
            return true;
        }
        return false;
    }

    public static boolean A0Z(C624134x r1) {
        if (!r1.A1J.A02 || !A0o(r1)) {
            return false;
        }
        int i = ((C30341mI) r1).A00;
        if (i == 147 || i == 155) {
            return true;
        }
        return false;
    }

    public static boolean A0a(C624134x r1) {
        if (r1.A1B) {
            AnonymousClass2z0 r12 = r1.A1J;
            if (!r12.A02 || (r12.A00 instanceof AnonymousClass1fS)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0b(C624134x r6) {
        if (!(r6 instanceof C30341mI)) {
            return false;
        }
        long j = (long) ((C30341mI) r6).A00;
        if (j == 61 || j == 69) {
            return true;
        }
        return false;
    }

    public static boolean A0c(C624134x r2) {
        if (!r2.A1J.A02 || !A0o(r2) || ((C30341mI) r2).A00 != 67) {
            return false;
        }
        return true;
    }

    public static boolean A0d(C624134x r1) {
        if (!r1.A1J.A02 || !A0o(r1)) {
            return false;
        }
        int i = ((C30341mI) r1).A00;
        if (i == 28 || i == 10) {
            return true;
        }
        return false;
    }

    public static boolean A0e(C624134x r2) {
        if (!r2.A1J.A02 || !A0o(r2) || ((C30341mI) r2).A00 != 57) {
            return false;
        }
        return true;
    }

    public static boolean A0f(C624134x r2) {
        if (!r2.A1J.A02 || !A0o(r2) || ((C30341mI) r2).A00 != 71) {
            return false;
        }
        return true;
    }

    public static boolean A0g(C624134x r1) {
        if (((r1 instanceof C30481mW) || (r1 instanceof C30471mV)) && C624134x.A0d(r1)) {
            return true;
        }
        return false;
    }

    public static boolean A0h(C624134x r2) {
        if (r2.A1I == 36) {
            return true;
        }
        if (!r2.A1J.A02 || !A0o(r2) || !(r2 instanceof C30341mI) || ((C30341mI) r2).A00 != 59) {
            return false;
        }
        return true;
    }

    public static boolean A0i(C624134x r4) {
        AnonymousClass39W A0Y;
        AnonymousClass39P r2;
        if ((r4 instanceof AnonymousClass4DV) && (A0Y = AnonymousClass0x9.A0Y(r4)) != null && (r2 = A0Y.A03) != null && A0Y.A00 == 5) {
            for (AnonymousClass395 r0 : r2.A03) {
                AnonymousClass398 r02 = r0.A01;
                if (r02 != null && "galaxy_message".equals(r02.A00)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0j(C624134x r2) {
        if (!r2.A1J.A02 || !A0o(r2) || ((C30341mI) r2).A00 != 18) {
            return false;
        }
        return true;
    }

    public static boolean A0l(C624134x r2) {
        byte b = r2.A1I;
        if (b == 15 || b == 64 || b == 83) {
            return true;
        }
        return false;
    }

    public static boolean A0n(C624134x r3) {
        if (!(r3 instanceof C31891p1) || ((C30341mI) r3).A00 != 145) {
            return false;
        }
        return true;
    }

    public static boolean A0o(C624134x r3) {
        byte b = r3.A1I;
        int i = r3.A0D;
        if (b == 0) {
            if (i != 6) {
                return false;
            }
            return true;
        } else if (b == 7) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean A0p(C624134x r1) {
        if (!(r1 instanceof C30481mW)) {
            return false;
        }
        C30481mW r12 = (C30481mW) r1;
        String str = r12.A06;
        String str2 = r12.A04;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    public static boolean A0q(C624134x r6) {
        if (!(r6 instanceof C30341mI)) {
            return false;
        }
        long j = (long) ((C30341mI) r6).A00;
        if (j == 22 || j == 34 || j == 35 || j == 36 || j == 23 || j == 24 || j == 25 || j == 26 || j == 46 || j == 47 || j == 48 || j == 49 || j == 50 || j == 55) {
            return true;
        }
        return false;
    }

    public static boolean A0r(C624134x r5) {
        AnonymousClass2z0 r2 = r5.A1J;
        C95814uZ r1 = r2.A00;
        if ((r5 instanceof C30341mI) || !r2.A02 || ((!(r1 instanceof UserJid) && !(r1 instanceof C28011fL)) || r5.A0I != 0 || r5.A1R != null || r5.A0C != 0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0t(X.C624134x r5) {
        /*
            int r0 = r5.A06
            r4 = 127(0x7f, float:1.78E-43)
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r3 = 0
            if (r0 != 0) goto L_0x001b
            X.2z0 r0 = r5.A1J
            boolean r2 = r0.A02
            r1 = 1
            int r0 = r5.A06
            if (r2 == 0) goto L_0x001c
            int r0 = java.lang.Math.max(r1, r0)
            if (r0 != r4) goto L_0x001b
        L_0x001a:
            r3 = 1
        L_0x001b:
            return r3
        L_0x001c:
            int r0 = r0 + 1
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 5
            if (r1 < r0) goto L_0x001b
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627636p.A0t(X.34x):boolean");
    }

    public static boolean A0u(C624134x r3, long j) {
        if (r3.A05 <= 0 || C18320x8.A04(r3.A0r) >= j || r3.A0j() == 1) {
            return false;
        }
        return true;
    }

    public static boolean A0y(C30471mV r3) {
        byte b = r3.A1I;
        if (b == 2) {
            if (r3.A09 == 1) {
                return true;
            }
        } else if (b == 20) {
            return true;
        }
        if (A0I(b) || b == 82) {
            return true;
        }
        return false;
    }

    public static int A00(C30471mV r1) {
        if (A0z(r1)) {
            return AnonymousClass000.A1S(C383227b.A00(r1) ? 1 : 0) ? 1 : 0;
        }
        if (A10(r1)) {
            return 2;
        }
        if (C383227b.A00(r1)) {
            return 4;
        }
        return 3;
    }

    public static C95814uZ A04(Collection collection) {
        Object obj;
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            obj = it.next();
        } else {
            obj = null;
        }
        C624134x r0 = (C624134x) obj;
        if (r0 == null) {
            return null;
        }
        return r0.A1J.A00;
    }

    @Deprecated
    public static C624134x A07(C56972sr r1, C56612sH r2, AnonymousClass1VX r3, C52552lf r4, C624134x r5) {
        AnonymousClass4FP r0;
        C30331mH A09;
        C30331mH A092;
        C624134x A08 = A08(r1, r2, r3, r4, r5);
        if (A08 == null && ((r0 = r5.A0L) == null || (A08 = A09(r1, r2, r3, r4, r0.B4S())) == null)) {
            if ((r5 instanceof C30451mT) && (A092 = A09(r1, r2, r3, r4, ((C30451mT) r5).A04)) != null) {
                return A092;
            }
            A08 = A09(r1, r2, r3, r4, Collections.singletonList(r5.A1S));
            if (A08 == null && (A08 = A09(r1, r2, r3, r4, Collections.singletonList(r5.A1T))) == null) {
                if (!(r5 instanceof AnonymousClass1nW) || (A09 = A09(r1, r2, r3, r4, Collections.singletonList(((AnonymousClass1nW) r5).A00))) == null) {
                    return null;
                }
                return A09;
            }
        }
        return A08;
    }

    public static AnonymousClass2z0 A0B(C624134x r2) {
        if (A0g(r2)) {
            C42602Ou A11 = r2.A11();
            if (A11 != null) {
                return A11.A02;
            }
            C626936e.A0D(false, "FMessageUtil/getOriginalMessageKeyIfEdited messageEditInfo missing for edited message");
        }
        return r2.A1J;
    }

    public static String A0E(C624134x r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0O(r3, "fmsg/status:", A0o);
        C624134x.A0T(r3, "/type:", A0o);
        AnonymousClass2z0 r1 = r3.A1J;
        if (C627336j.A0K(r1.A00) && (r3 instanceof C30341mI)) {
            A0o.append("/grp_action:");
            A0o.append(((C30341mI) r3).A00);
        }
        C624134x.A0R(r3, "/rmt-src:", A0o);
        C18270x1.A1H(A0o, " ", r1);
        return A0o.toString();
    }

    public static void A0F(C56972sr r0, C56982ss r1, C624134x r2) {
        AnonymousClass31A A00;
        if (A0M(r0, r2) && (A00 = C56982ss.A00(r1, r2.A1J.A00)) != null) {
            synchronized (A00) {
                int i = A00.A06;
                if (i > 0) {
                    A00.A06 = i - 1;
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("chatInfo/decrementUnseenImportantMessageCount/");
                C18260x0.A1L(A0o, A00.A08());
            }
        }
    }

    public static boolean A0J(byte b) {
        if (A0I(b) || b == 82 || b == 78) {
            return true;
        }
        return false;
    }

    public static boolean A0L(C55682qk r3, C56972sr r4, C56982ss r5, C56892sj r6, C624134x r7) {
        byte b;
        if (A0P(r4, r7) || (b = r7.A1I) == 64 || b == 83) {
            C95814uZ r1 = r7.A1J.A00;
            if (!(r1 instanceof GroupJid) || (r7 instanceof C30951nU) || (r7 instanceof C30331mH) || (r7 instanceof C30341mI) || (r7 instanceof C30351mJ) || C624134x.A0g(r7) || !r5.A0O(r1) || r6.A0D((GroupJid) r1)) {
                return true;
            }
            Log.e("SendMessageMethods/only admins can send message to CAGs");
            r3.A0A("SendMessageMethods/prohibited send to CAG", false, (String) null);
        }
        return false;
    }

    public static boolean A0S(C56972sr r2, C624134x r3) {
        if ((A0n(r3) || (!(r3 instanceof C31581oW) ? (r3 instanceof C31741om) : ((C30341mI) r3).A00 == 88)) && !C56972sr.A0A(r2, r3)) {
            return true;
        }
        return false;
    }

    public static boolean A0W(C56982ss r1, C624134x r2) {
        if (r2.A1p()) {
            return true;
        }
        if (C624134x.A0g(r2) && r2.A0t() != null) {
            return true;
        }
        if (!(r2 instanceof C30331mH) && r1.A0O(r2.A1J.A00)) {
            return true;
        }
        if (!r2.A1k() || r2.A06 != 0) {
            return false;
        }
        return true;
    }

    public static boolean A0k(C624134x r3) {
        if (AnonymousClass353.A04(r3)) {
            for (C46532bn r0 : C40802Hu.A01(r3).A02) {
                if (r0.A02 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0m(C624134x r1) {
        if (!A0l(r1) || !AnonymousClass001.A1U(AnonymousClass358.A00(r1.A0D, 4))) {
            return false;
        }
        return true;
    }

    public static boolean A0v(C624134x r3, C183538qC r4) {
        if (((C1229766o) r4.get()).BH2(r3.A1J.A00)) {
            return false;
        }
        if (AnonymousClass000.A1U(r3.A0A & 512, 512) || AnonymousClass000.A1U(r3.A0A & ZipDecompressor.UNZIP_BUFFER_SIZE, ZipDecompressor.UNZIP_BUFFER_SIZE)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009c, code lost:
        if (r3 != 63) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0w(X.C624134x r6, boolean r7) {
        /*
            boolean r0 = A0a(r6)
            if (r0 == 0) goto L_0x0008
            if (r7 == 0) goto L_0x0057
        L_0x0008:
            byte r5 = r6.A1I
            r0 = 24
            if (r5 != r0) goto L_0x00c2
            X.2z0 r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0016
            if (r7 == 0) goto L_0x0057
        L_0x0016:
            boolean r0 = A0c(r6)
            if (r0 != 0) goto L_0x0057
            boolean r0 = A0j(r6)
            if (r0 != 0) goto L_0x0057
            boolean r0 = A0e(r6)
            if (r0 != 0) goto L_0x0057
            boolean r0 = A0f(r6)
            if (r0 != 0) goto L_0x0057
            X.2z0 r2 = r6.A1J
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0059
            boolean r0 = A0o(r6)
            if (r0 == 0) goto L_0x0059
            r0 = r6
            X.1mI r0 = (X.C30341mI) r0
            int r1 = r0.A00
            r0 = 50
            if (r1 == r0) goto L_0x0057
            r0 = 49
            if (r1 == r0) goto L_0x0057
            r0 = 47
            if (r1 == r0) goto L_0x0057
            r0 = 48
            if (r1 == r0) goto L_0x0057
            r0 = 46
            if (r1 == r0) goto L_0x0057
            r0 = 55
            if (r1 != r0) goto L_0x0059
        L_0x0057:
            r1 = 0
        L_0x0058:
            return r1
        L_0x0059:
            boolean r0 = A0q(r6)
            if (r0 != 0) goto L_0x0057
            boolean r0 = A0d(r6)
            if (r0 == 0) goto L_0x0076
            if (r7 == 0) goto L_0x0057
            X.4uZ r1 = r2.A00
            if (r1 == 0) goto L_0x0057
            r0 = r6
            X.1o8 r0 = (X.C31341o8) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
        L_0x0076:
            boolean r0 = r6 instanceof X.C31241ny
            if (r0 != 0) goto L_0x0057
            boolean r0 = A0b(r6)
            if (r0 != 0) goto L_0x0057
            boolean r0 = r6 instanceof X.C31091nj
            if (r0 != 0) goto L_0x0057
            boolean r0 = r6 instanceof X.C31511oP
            if (r0 != 0) goto L_0x0057
            boolean r0 = r6 instanceof X.C30341mI
            if (r0 == 0) goto L_0x009f
            r0 = r6
            X.1mI r0 = (X.C30341mI) r0
            int r0 = r0.A00
            long r3 = (long) r0
            r1 = 62
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
            r1 = 63
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009f
            goto L_0x0057
        L_0x009f:
            r0 = 88
            if (r5 == r0) goto L_0x0057
            r0 = 87
            if (r5 == r0) goto L_0x0057
            X.2nF r0 = r6.A0r()
            if (r0 == 0) goto L_0x00b6
            X.2nF r0 = r6.A0r()
            X.21g r0 = r0.A00
            if (r0 == 0) goto L_0x00b6
            goto L_0x0057
        L_0x00b6:
            boolean r0 = r6 instanceof X.C31021nc
            if (r0 != 0) goto L_0x0057
            boolean r0 = A0Z(r6)
            r1 = 1
            if (r0 == 0) goto L_0x0058
            goto L_0x0057
        L_0x00c2:
            r0 = 8
            if (r5 == r0) goto L_0x0057
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627636p.A0w(X.34x, boolean):boolean");
    }

    public static boolean A0x(C30471mV r6) {
        int[] A07;
        C613030d A1v = r6.A1v();
        if (A1v == null || !A1v.A04() || (A07 = A1v.A07()) == null || A07.length < 4) {
            return false;
        }
        if (C30471mV.A00(r6).A09 >= C18310x6.A0C(A07)) {
            return true;
        }
        return false;
    }

    public static boolean A0z(C30471mV r1) {
        AnonymousClass33C A00 = C30471mV.A00(r1);
        if (!A00.A0c || A00.A0a) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r4.A1J.A02 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A10(X.C30471mV r4) {
        /*
            boolean r0 = X.C383527f.A00(r4)
            r3 = 0
            if (r0 != 0) goto L_0x002e
            X.33C r2 = X.C30471mV.A00(r4)
            boolean r0 = r2.A0Z
            if (r0 == 0) goto L_0x0016
            X.2z0 r0 = r4.A1J
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x002d
        L_0x001d:
            boolean r0 = r4.A1B
            if (r0 == 0) goto L_0x002e
            X.2z0 r1 = r4.A1J
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x002e
            X.4uZ r0 = r1.A00
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627636p.A10(X.1mV):boolean");
    }

    public static boolean A0s(C624134x r6) {
        if (1528398000000L <= r6.A0K && AnonymousClass000.A1U(r6.A0A & 1, 1)) {
            if (!AnonymousClass353.A04(r6)) {
                byte b = r6.A1I;
                if (b != 0) {
                    if (!(b == 1 || b == 2 || b == 3 || b == 4 || b == 5 || b == 9 || b == 23 || b == 32 || b == 37 || b == 52 || b == 55 || b == 57 || b == 85 || b == 13 || b == 14 || b == 62 || b == 63)) {
                        switch (b) {
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                                break;
                        }
                    }
                } else if (r6.A0P == null) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
