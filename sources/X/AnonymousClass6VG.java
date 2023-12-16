package X;

import java.io.IOException;

/* renamed from: X.6VG  reason: invalid class name */
public final class AnonymousClass6VG extends AnonymousClass6V4 implements C180958lu {
    public static final AnonymousClass6VG zzb;
    public C188218yX zzd = AnonymousClass6VB.A02;

    public static AnonymousClass6VG A04(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr.length;
        C159997mr r2 = C159997mr.A01;
        AnonymousClass6VG r5 = new AnonymousClass6VG();
        try {
            C185828uJ A00 = C157357iA.A02.A00(r5.getClass());
            A00.Bu8(new C156597gt(r2), r5, bArr2, 0, length);
            A00.Bu3(r5);
            if (r5.zza == 0) {
                return r5;
            }
            throw new RuntimeException();
        } catch (AnonymousClass6u4 e) {
            e = e;
            e.zza = r5;
            throw e;
        } catch (AnonymousClass8R8 e2) {
            e = new AnonymousClass6u4(e2.getMessage());
            e.zza = r5;
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof AnonymousClass6u4) {
                throw e3.getCause();
            }
            e = new AnonymousClass6u4(e3);
            e.zza = r5;
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            e = new AnonymousClass6u4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            e.zza = r5;
            throw e;
        }
    }

    static {
        AnonymousClass6VG r2 = new AnonymousClass6VG();
        zzb = r2;
        AnonymousClass6V4.zzb.put(AnonymousClass6VG.class, r2);
    }
}
