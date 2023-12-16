package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.54x  reason: invalid class name and case insensitive filesystem */
public class C992254x extends AnonymousClass5ZM {
    public final int A00;
    public final AnonymousClass7DM A01;
    public final File A02;
    public final boolean A03;
    public final byte[] A04;

    public C992254x(C15910sA r2, AnonymousClass7DM r3, File file, byte[] bArr, int i, boolean z) {
        super(r2, true);
        this.A01 = r3;
        this.A04 = bArr;
        this.A00 = i;
        this.A03 = z;
        this.A02 = file;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        StringBuilder sb;
        String str;
        FileOutputStream A0h;
        try {
            File file = this.A02;
            A0h = AnonymousClass0x9.A0h(file);
            A0h.write(this.A04);
            A0h.close();
            return new AnonymousClass7KV(file, this.A00, this.A03);
        } catch (FileNotFoundException e) {
            e = e;
            sb = AnonymousClass001.A0o();
            str = "cameraui/ File not found: ";
            Log.e(AnonymousClass000.A0a(str, sb, e), e);
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = AnonymousClass001.A0o();
            str = "cameraui/ Error accessing file: ";
            Log.e(AnonymousClass000.A0a(str, sb, e), e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass7KV r8 = (AnonymousClass7KV) obj;
        AnonymousClass5ZS r6 = this.A01.A00;
        if (r6.A0A != null) {
            C86604Kt.A1B(r6.A09, R.id.save_progress);
            if (r8 == null) {
                r6.A0b.A0H(R.string.f11nameremoved, 1);
                r6.A11.BOE();
                return;
            }
            r6.A0K(new C114195me(C620633i.A02(r6.A0m), r8.A01, r8.A00, r8.A02), (C95294tG) null, true);
        }
    }
}
