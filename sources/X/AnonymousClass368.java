package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.368  reason: invalid class name */
public class AnonymousClass368 {
    public static int A03(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -867509719:
                    if (str.equals("reaction")) {
                        return 48;
                    }
                    break;
                case 110760:
                    if (str.equals("pay")) {
                        return 46;
                    }
                    break;
                case 3446719:
                    if (str.equals("poll")) {
                        return 47;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        return 45;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        return 44;
                    }
                    break;
                case 431262765:
                    if (str.equals("medianotify")) {
                        return 49;
                    }
                    break;
            }
        }
        return 1;
    }

    public static Integer A04(int i) {
        int i2;
        if (i != 7) {
            i2 = 1;
            if (i != 8) {
                return null;
            }
        } else {
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }

    public static int A00(C95814uZ r1) {
        if (r1 instanceof C135166kE) {
            return 3;
        }
        if (C627336j.A0K(r1)) {
            return 2;
        }
        if (r1 instanceof C135176kF) {
            return 6;
        }
        if (r1 instanceof AnonymousClass1fS) {
            return 14;
        }
        if (r1 instanceof C95804uY) {
            return 13;
        }
        return 1;
    }

    public static int A01(C95814uZ r1, boolean z) {
        if (z) {
            return 12;
        }
        if (r1 instanceof C95804uY) {
            return 10;
        }
        if (r1 instanceof C135166kE) {
            return 4;
        }
        if (C627336j.A0K(r1)) {
            return 3;
        }
        if (r1 instanceof AnonymousClass1fS) {
            return 11;
        }
        return 2;
    }

    public static int A02(C624134x r1) {
        C95814uZ r0 = r1.A1J.A00;
        boolean z = r0 instanceof C135166kE;
        boolean A0K = C627336j.A0K(r0);
        if (z) {
            return 3;
        }
        return C18280x3.A00(A0K ? 1 : 0);
    }

    public static Integer A05(C56972sr r1, DeviceJid deviceJid) {
        int i;
        if (deviceJid == null) {
            return null;
        }
        if (r1.A0b(deviceJid)) {
            i = 3;
        } else if (C56972sr.A09(r1, deviceJid)) {
            i = 1;
        } else {
            i = 2;
            if (AnonymousClass0x9.A1P(deviceJid)) {
                i = 4;
            }
        }
        return Integer.valueOf(i);
    }

    public static Integer A06(Jid jid, Jid jid2) {
        int A00;
        boolean z = jid2 instanceof AnonymousClass1fI;
        Integer A0S = C18280x3.A0S();
        if (z || (jid instanceof AnonymousClass1fI)) {
            return A0S;
        }
        if (jid == null) {
            return null;
        }
        if (C627336j.A0K(jid)) {
            A00 = 1;
        } else if (jid instanceof C135166kE) {
            A00 = 3;
        } else {
            A00 = AnonymousClass0x9.A00(jid instanceof C95804uY ? 1 : 0);
        }
        return Integer.valueOf(A00);
    }

    public static String A07(AnonymousClass36Y r5, AnonymousClass1EU r6) {
        int i = r6.bitField0_;
        if ((i & 4) != 0) {
            return "image";
        }
        if ((i & 8) != 0) {
            return "vcard";
        }
        if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            return "contact_array";
        }
        if ((i & 16) != 0) {
            return "location";
        }
        if ((65536 & i) != 0) {
            return "livelocation";
        }
        if (AnonymousClass000.A1S(i & 32)) {
            AnonymousClass1EC r0 = r6.extendedTextMessage_;
            AnonymousClass1EC r1 = r0;
            if (r0 == null) {
                r0 = AnonymousClass1EC.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 2) != 0) {
                if (r1 == null) {
                    r1 = AnonymousClass1EC.DEFAULT_INSTANCE;
                }
                String str = r1.text_;
                C106685Zz r12 = r5.A07;
                if (r5.A0J(r12.A03(str))) {
                    return "cataloglink";
                }
                if (r5.A0K(r12.A03(str))) {
                    return "productlink";
                }
                return "url";
            }
        } else if ((i & 64) != 0) {
            return "document";
        } else {
            if ((i & 128) != 0) {
                AnonymousClass1E5 r02 = r6.audioMessage_;
                if (r02 == null) {
                    r02 = AnonymousClass1E5.DEFAULT_INSTANCE;
                }
                if (r02.ptt_) {
                    return "ptt";
                }
                return "audio";
            } else if ((i & 256) != 0) {
                AnonymousClass1ED r03 = r6.videoMessage_;
                if (r03 == null) {
                    r03 = AnonymousClass1ED.DEFAULT_INSTANCE;
                }
                if (r03.gifPlayback_) {
                    return "gif";
                }
                return "video";
            } else {
                int i2 = r6.bitField1_;
                if ((2097152 & i2) != 0) {
                    return "ptv";
                }
                if (!AnonymousClass000.A1S(r6.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
                    if (AnonymousClass000.A1S(r6.bitField0_ & 2097152)) {
                        AnonymousClass1EA r04 = r6.stickerMessage_;
                        if (r04 == null) {
                            r04 = AnonymousClass1EA.DEFAULT_INSTANCE;
                        }
                        if (r04.isAvatar_) {
                            return "avatar_sticker";
                        }
                        return "sticker";
                    } else if ((16777216 & i) != 0) {
                        AnonymousClass1DU r05 = r6.productMessage_;
                        AnonymousClass1DU r13 = r05;
                        if (r05 == null) {
                            r05 = AnonymousClass1DU.DEFAULT_INSTANCE;
                        }
                        if ((r05.bitField0_ & 1) != 0) {
                            return "product";
                        }
                        if (r13 == null) {
                            r13 = AnonymousClass1DU.DEFAULT_INSTANCE;
                        }
                        if ((r13.bitField0_ & 4) != 0) {
                            return "catalog";
                        }
                    } else if ((536870912 & i) != 0) {
                        return "order";
                    } else {
                        if ((134217728 & i) != 0) {
                            return "list";
                        }
                        if ((i & 1073741824) != 0) {
                            return "list_response";
                        }
                        if ((i2 & 2) != 0) {
                            return "buttons_response";
                        }
                        if ((i2 & 32) != 0) {
                            C21521Cd r06 = r6.interactiveResponseMessage_;
                            if (r06 == null) {
                                r06 = C21521Cd.DEFAULT_INSTANCE;
                            }
                            if (r06.interactiveResponseMessageCase_ == 2) {
                                return "native_flow_response";
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
