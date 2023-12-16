package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.33W  reason: invalid class name */
public abstract class AnonymousClass33W {
    public static final Set A08 = Collections.unmodifiableSet(C18280x3.A0h(new String[]{"regular", "regular_low", "regular_high", "critical_block", "critical_unblock_low"}));
    public static final Set A09 = Collections.unmodifiableSet(C18280x3.A0h(new String[]{"critical_block", "critical_unblock_low"}));
    public AnonymousClass33J A00;
    public boolean A01;
    public byte[] A02;
    public final int A03;
    public final long A04;
    public final C60642yt A05;
    public final String A06;
    public final String A07;

    public synchronized void A0A(boolean z) {
        this.A01 = z;
    }

    public synchronized boolean A0B() {
        return this.A01;
    }

    public boolean equals(Object obj) {
        byte[] A0F;
        byte[] A0F2;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass33W r5 = (AnonymousClass33W) obj;
            if (!Arrays.equals(A0C(), r5.A0C()) || !this.A05.equals(r5.A05)) {
                return false;
            }
            AnonymousClass1EO A072 = A07();
            if (A072 == null) {
                A0F = null;
            } else {
                A0F = A072.A0F();
            }
            AnonymousClass1EO A073 = r5.A07();
            if (A073 == null) {
                A0F2 = null;
            } else {
                A0F2 = A073.A0F();
            }
            return Arrays.equals(A0F, A0F2);
        }
    }

    public static void A03(AnonymousClass33W r2, StringBuilder sb) {
        sb.append(", timestamp=");
        sb.append(r2.A04);
        sb.append(", operation=");
        sb.append(r2.A05);
    }

    public static void A04(AnonymousClass33W r1, StringBuilder sb) {
        sb.append(", collectionName=");
        sb.append(r1.A06);
        sb.append(", keyId=");
    }

    public AnonymousClass18L A06() {
        AnonymousClass18L r4 = (AnonymousClass18L) AnonymousClass1EO.DEFAULT_INSTANCE.A0G();
        long j = this.A04;
        AnonymousClass1EO r1 = (AnonymousClass1EO) C18320x8.A0C(r4);
        r1.bitField0_ |= 1;
        r1.timestamp_ = j;
        return r4;
    }

    public AnonymousClass1EO A07() {
        AnonymousClass18L A062;
        if ((this instanceof AnonymousClass1SL) || (A062 = A06()) == null) {
            return null;
        }
        return (AnonymousClass1EO) A062.A06();
    }

    public String A08() {
        if (this instanceof AnonymousClass1SO) {
            String str = ((AnonymousClass1SO) this).A01;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("[\"removeRecentSticker\",\"");
            A0o.append(str);
            return AnonymousClass000.A0X("\"]", A0o);
        } else if (this instanceof AnonymousClass1SL) {
            return ((AnonymousClass1SL) this).A00;
        } else {
            if (!(this instanceof AnonymousClass1SP)) {
                return A01(A0C());
            }
            String str2 = ((AnonymousClass1SP) this).A01.A07;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("[\"favoriteSticker\",\"");
            A0o2.append(str2);
            return AnonymousClass000.A0X("\"]", A0o2);
        }
    }

    public String A09() {
        if (this instanceof AnonymousClass1SM) {
            return "userStatusMute";
        }
        if (this instanceof AnonymousClass1SJ) {
            return "setting_unarchiveChats";
        }
        if (this instanceof AnonymousClass1SI) {
            return "time_format";
        }
        if (this instanceof AnonymousClass1SA) {
            return "status_privacy";
        }
        if (this instanceof C23291Sa) {
            return "star";
        }
        if (this instanceof AnonymousClass1SQ) {
            return "shareOwnPn";
        }
        if (this instanceof AnonymousClass1SH) {
            return "sentinel";
        }
        if (this instanceof AnonymousClass1SO) {
            return "removeRecentSticker";
        }
        if (this instanceof AnonymousClass1SL) {
            return ((AnonymousClass1SL) this).A01[0];
        }
        if (this instanceof AnonymousClass1SG) {
            return "setting_pushName";
        }
        if (this instanceof AnonymousClass1SK) {
            return "primary_version";
        }
        if (this instanceof AnonymousClass1SF) {
            return "primary_feature";
        }
        if (this instanceof AnonymousClass1SS) {
            return "pnForLidChat";
        }
        if (this instanceof AnonymousClass1SY) {
            return "pin_v1";
        }
        if (this instanceof AnonymousClass1SR) {
            return "nux";
        }
        if (this instanceof AnonymousClass1SX) {
            return "mute";
        }
        if (this instanceof AnonymousClass1SV) {
            return "markChatAsRead";
        }
        if (this instanceof AnonymousClass1SE) {
            return "setting_locale";
        }
        if (this instanceof AnonymousClass1SP) {
            return "favoriteSticker";
        }
        if (this instanceof AnonymousClass1SZ) {
            return "deleteMessageForMe";
        }
        if (this instanceof AnonymousClass1ST) {
            return "deleteChat";
        }
        if (this instanceof AnonymousClass1SN) {
            return "contact";
        }
        if (this instanceof AnonymousClass1SU) {
            return "clearChat";
        }
        if (this instanceof AnonymousClass1SC) {
            return "call_log";
        }
        if (this instanceof AnonymousClass1SW) {
            return "archive";
        }
        if (this instanceof AnonymousClass1SD) {
            return "android_unsupported_actions";
        }
        return ((AnonymousClass1SB) this).A00.A04();
    }

    public String[] A0C() {
        String str;
        String str2;
        boolean z;
        String[] strArr;
        String str3;
        char c;
        String str4;
        String[] strArr2;
        AnonymousClass2z0 r2;
        C95814uZ r0;
        if (this instanceof AnonymousClass1SM) {
            String[] A1Z = AnonymousClass0x9.A1Z();
            A1Z[0] = "userStatusMute";
            C18310x6.A1D(((AnonymousClass1SM) this).A00, A1Z);
            return A1Z;
        }
        if (this instanceof AnonymousClass1SJ) {
            str = "setting_unarchiveChats";
        } else if (this instanceof AnonymousClass1SI) {
            str = "time_format";
        } else if (this instanceof AnonymousClass1SA) {
            str = "status_privacy";
        } else {
            if (this instanceof C23291Sa) {
                C23291Sa r1 = (C23291Sa) this;
                strArr2 = new String[]{"star"};
                r2 = r1.A01;
                r0 = r1.A00;
            } else if (this instanceof AnonymousClass1SQ) {
                C27981fH r12 = ((AnonymousClass1SQ) this).A00;
                String[] A1Z2 = AnonymousClass0x9.A1Z();
                AnonymousClass0x2.A15(r12, "shareOwnPn", A1Z2);
                return A1Z2;
            } else {
                if (this instanceof AnonymousClass1SH) {
                    strArr = AnonymousClass0x9.A1Z();
                    strArr[0] = "sentinel";
                    c = 1;
                    str4 = this.A06;
                } else if (this instanceof AnonymousClass1SO) {
                    strArr = AnonymousClass0x9.A1Z();
                    strArr[0] = "removeRecentSticker";
                    c = 1;
                    str4 = ((AnonymousClass1SO) this).A01;
                } else if (this instanceof AnonymousClass1SL) {
                    return ((AnonymousClass1SL) this).A01;
                } else {
                    if (this instanceof AnonymousClass1SG) {
                        str = "setting_pushName";
                    } else if (this instanceof AnonymousClass1SK) {
                        strArr = AnonymousClass0x9.A1Z();
                        strArr[0] = "primary_version";
                        c = 1;
                        str4 = ((AnonymousClass1SK) this).A01;
                    } else if (this instanceof AnonymousClass1SF) {
                        str = "primary_feature";
                    } else if (this instanceof AnonymousClass1SS) {
                        C27981fH r13 = ((AnonymousClass1SS) this).A00;
                        String[] A1Z3 = AnonymousClass0x9.A1Z();
                        AnonymousClass0x2.A15(r13, "pnForLidChat", A1Z3);
                        return A1Z3;
                    } else if (this instanceof AnonymousClass1SY) {
                        C95814uZ r14 = ((AnonymousClass1SY) this).A00;
                        String[] A1Z4 = AnonymousClass0x9.A1Z();
                        AnonymousClass0x2.A15(r14, "pin_v1", A1Z4);
                        return A1Z4;
                    } else if (this instanceof AnonymousClass1SR) {
                        strArr = AnonymousClass0x9.A1Z();
                        strArr[0] = "nux";
                        c = 1;
                        str4 = ((AnonymousClass1SR) this).A00;
                    } else if (this instanceof AnonymousClass1SX) {
                        String[] A1Z5 = AnonymousClass0x9.A1Z();
                        A1Z5[0] = "mute";
                        C18310x6.A1D(((AnonymousClass1SX) this).A01, A1Z5);
                        return A1Z5;
                    } else if (this instanceof AnonymousClass1SV) {
                        C95814uZ r15 = ((AnonymousClass1SV) this).A01;
                        String[] A1Z6 = AnonymousClass0x9.A1Z();
                        AnonymousClass0x2.A15(r15, "markChatAsRead", A1Z6);
                        return A1Z6;
                    } else if (this instanceof AnonymousClass1SE) {
                        str = "setting_locale";
                    } else if (this instanceof AnonymousClass1SP) {
                        String[] A1Z7 = AnonymousClass0x9.A1Z();
                        A1Z7[0] = "favoriteSticker";
                        A1Z7[1] = ((AnonymousClass1SP) this).A01.A07;
                        return A1Z7;
                    } else if (this instanceof AnonymousClass1SZ) {
                        AnonymousClass1SZ r16 = (AnonymousClass1SZ) this;
                        strArr2 = new String[]{"deleteMessageForMe"};
                        r2 = r16.A02;
                        r0 = r16.A01;
                    } else {
                        if (this instanceof AnonymousClass1ST) {
                            AnonymousClass1ST r02 = (AnonymousClass1ST) this;
                            C95814uZ r17 = r02.A01;
                            z = r02.A02;
                            strArr = AnonymousClass0x9.A1a();
                            AnonymousClass0x2.A15(r17, "deleteChat", strArr);
                            c = 2;
                        } else if (this instanceof AnonymousClass1SN) {
                            String[] A1Z8 = AnonymousClass0x9.A1Z();
                            A1Z8[0] = "contact";
                            C18310x6.A1D(((AnonymousClass1SN) this).A01, A1Z8);
                            return A1Z8;
                        } else if (this instanceof AnonymousClass1SU) {
                            AnonymousClass1SU r03 = (AnonymousClass1SU) this;
                            C95814uZ r18 = r03.A01;
                            boolean z2 = r03.A03;
                            z = r03.A02;
                            strArr = new String[4];
                            AnonymousClass0x2.A15(r18, "clearChat", strArr);
                            if (z2) {
                                str3 = "1";
                            } else {
                                str3 = "0";
                            }
                            strArr[2] = str3;
                            c = 3;
                        } else if (this instanceof AnonymousClass1SC) {
                            String[] strArr3 = new String[4];
                            strArr3[0] = "call_log";
                            C52392lP r22 = ((AnonymousClass1SC) this).A01;
                            C18310x6.A1D(r22.A00, strArr3);
                            strArr3[2] = r22.A01;
                            if (r22.A02) {
                                str2 = "1";
                            } else {
                                str2 = "0";
                            }
                            strArr3[3] = str2;
                            return strArr3;
                        } else if (this instanceof AnonymousClass1SW) {
                            C95814uZ r19 = ((AnonymousClass1SW) this).A01;
                            String[] A1Z9 = AnonymousClass0x9.A1Z();
                            AnonymousClass0x2.A15(r19, "archive", A1Z9);
                            return A1Z9;
                        } else if (this instanceof AnonymousClass1SD) {
                            str = "android_unsupported_actions";
                        } else {
                            AnonymousClass1SB r3 = (AnonymousClass1SB) this;
                            String[] A1Z10 = AnonymousClass0x9.A1Z();
                            A1Z10[0] = r3.A00.A04();
                            A1Z10[1] = r3.A02;
                            return AnonymousClass0x7.A1b(C73703fw.A03(A1Z10));
                        }
                        if (z) {
                            str4 = "1";
                        } else {
                            str4 = "0";
                        }
                    }
                }
                strArr[c] = str4;
                return strArr;
            }
            return AnonymousClass34E.A01(r0, r2, strArr2);
        }
        return new String[]{str};
    }

    public AnonymousClass33W(C60642yt r1, AnonymousClass33J r2, String str, String str2, int i, long j, boolean z) {
        this.A04 = j;
        this.A07 = str;
        this.A03 = i;
        this.A00 = r2;
        this.A05 = r1;
        this.A06 = str2;
        this.A01 = z;
    }

    public static AnonymousClass1EO A00(C130546c9 r0) {
        C626936e.A06(r0);
        r0.A07();
        return (AnonymousClass1EO) r0.A00;
    }

    public static String A01(String[] strArr) {
        JSONArray A1F = AnonymousClass0x9.A1F();
        for (String put : strArr) {
            A1F.put(put);
        }
        String obj = A1F.toString();
        C626936e.A06(obj);
        return obj;
    }

    public static void A02(AnonymousClass33W r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A07);
    }

    public static void A05(AnonymousClass33W r1, StringBuilder sb, long j) {
        sb.append(j);
        sb.append(", areDependenciesMissing=");
        sb.append(r1.A0B());
        sb.append(", operation=");
        sb.append(r1.A05);
        sb.append(", collectionName=");
        sb.append(r1.A06);
        sb.append(", keyId=");
        sb.append(r1.A00);
        sb.append('}');
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, Arrays.hashCode(A0C()));
        A1X[1] = this.A05;
        return C18310x6.A08(A07(), A1X, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A02(this, "SyncMutation{rowId='", A0o);
        A0o.append('\'');
        A03(this, A0o);
        A0o.append(", collectionName='");
        A0o.append(this.A06);
        A0o.append('\'');
        A0o.append(", version=");
        A0o.append(this.A03);
        A0o.append(", keyId=");
        A0o.append(this.A00);
        A0o.append(", areDependenciesMissing=");
        A0o.append(this.A01);
        return AnonymousClass000.A0d(A0o);
    }
}
