package X;

import com.whatsapp.Mp4Ops;
import java.io.File;

/* renamed from: X.7bG  reason: invalid class name and case insensitive filesystem */
public class C153407bG {
    public final C56612sH A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;

    public C134206ic A02(File file, File file2) {
        int i = 1 << 5;
        if ((this.A01.A0N(5561) & i) != i) {
            return null;
        }
        C134206ic r4 = new C134206ic();
        Long A0T = AnonymousClass0x2.A0T();
        r4.A0B = A0T;
        if (file != null) {
            A0T = AnonymousClass0x9.A0n(0, file.length());
            r4.A0B = A0T;
        }
        if (file2 != null) {
            r4.A0B = AnonymousClass0x9.A0n(A0T.longValue(), file2.length());
        }
        r4.A02 = C18290x4.A0Z();
        A01(r4, 5);
        return r4;
    }

    public C134206ic A03(File file, File file2) {
        int i = 1 << 7;
        if ((this.A01.A0N(5561) & i) != i) {
            return null;
        }
        C134206ic r5 = new C134206ic();
        r5.A0B = AnonymousClass6C9.A0Z(file);
        r5.A0C = AnonymousClass0x2.A0T();
        r5.A0C = AnonymousClass0x9.A0n(0, file2.length());
        r5.A02 = C18290x4.A0Z();
        A01(r5, 7);
        return r5;
    }

    public final C134206ic A04(File file, Integer num, boolean z) {
        long j;
        String A0z;
        int i;
        int A0N = this.A01.A0N(5561);
        int intValue = 1 << num.intValue();
        if ((A0N & intValue) != intValue) {
            return null;
        }
        C134206ic r2 = new C134206ic();
        if (z) {
            j = 0;
        } else {
            j = 2;
        }
        r2.A0A = Long.valueOf(j);
        r2.A0B = AnonymousClass6C9.A0Z(file);
        String A08 = C627536m.A08(file.getAbsolutePath());
        if (A08 == null) {
            A0z = "";
        } else {
            A0z = AnonymousClass0x9.A0z(A08);
        }
        r2.A02 = C18290x4.A0Z();
        if (A0z.equals("mov")) {
            i = 1;
        } else {
            if (A0z.equals("mpd")) {
                i = 2;
            }
            A01(r2, num);
            return r2;
        }
        r2.A02 = Integer.valueOf(i);
        A01(r2, num);
        return r2;
    }

    public void A05(Mp4Ops.LibMp4OperationResult libMp4OperationResult, C134206ic r4, File file) {
        long length;
        if (r4 != null) {
            C134206ic.A01(r4);
            r4.A0D = AnonymousClass0x9.A0m(libMp4OperationResult.errorCode);
            if (file == null) {
                length = 0;
            } else {
                length = file.length();
            }
            r4.A0C = Long.valueOf(length);
            Mp4Ops.AudioStreamInfo audioStreamInfo = libMp4OperationResult.asi;
            if (audioStreamInfo != null) {
                C134206ic.A00(audioStreamInfo, r4);
                r4.A09 = AnonymousClass0x2.A0U();
                r4.A01 = Integer.valueOf(audioStreamInfo.type);
            }
            AnonymousClass6C8.A10(libMp4OperationResult.vsi, r4);
        }
    }

    public void A06(C134116iT r5) {
        if (r5 != null) {
            Long l = r5.A0C;
            if (l != null) {
                r5.A0C = C18310x6.A0f(System.nanoTime(), l.longValue());
            }
            this.A02.BhD(r5);
        }
    }

    public final boolean A07(Integer num) {
        int A0N = this.A01.A0N(5658);
        int intValue = 1 << num.intValue();
        if ((A0N & intValue) == intValue) {
            return true;
        }
        return false;
    }

    public C153407bG(C56612sH r1, AnonymousClass1VX r2, AnonymousClass4FV r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static void A00(Mp4Ops.LibMp4OperationResult libMp4OperationResult, C153407bG r1, C134206ic r2, File file) {
        r1.A05(libMp4OperationResult, r2, file);
        if (r2 != null) {
            r1.A02.BhD(r2);
        }
    }

    public static void A01(C134206ic r2, Integer num) {
        r2.A03 = Integer.valueOf(Mp4Ops.getMp4opsImpl());
        r2.A04 = num;
        r2.A0E = Long.valueOf(System.nanoTime());
    }
}
