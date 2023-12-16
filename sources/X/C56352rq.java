package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2rq  reason: invalid class name and case insensitive filesystem */
public class C56352rq {
    public final C64393Dh A00;
    public final C49712gy A01;
    public final C54292oU A02;
    public final AnonymousClass2Y6 A03;
    public final C106695a0 A04;
    public final C60152y5 A05;

    public final boolean A07(File file) {
        try {
            C64393Dh r2 = this.A00;
            if (!r2.A0e(file) && !r2.A0d(file)) {
                return C18290x4.A1V(r2.A08().A08, file.getCanonicalPath());
            }
        } catch (IOException e) {
            Log.e("ReferenceCountedFileManager/isExternalManagedMediaFile ", e);
            return false;
        }
    }

    public final int A00(File file, int i) {
        C69833Yo Axl;
        int i2;
        AnonymousClass2Y6 r1 = this.A03;
        String absolutePath = file.getAbsolutePath();
        C626936e.A0C(AnonymousClass001.A1U(i));
        C85284Fq A042 = r1.A01.A04();
        try {
            Axl = A042.Axl();
            int A002 = r1.A00(absolutePath);
            if (A002 <= i) {
                ((AnonymousClass3H0) A042).A03.A07("media_refs", "path = ?", "DELETE_MEDIA_REF_SQL", new String[]{absolutePath});
            } else {
                C56702sQ A0G = ((AnonymousClass3H0) A042).A03.A0G("UPDATE media_refs SET ref_count = ref_count + ? WHERE path = ?", "UPDATE_MEDIA_REF_SQL");
                A0G.A06(1, (long) (-i));
                A0G.A07(2, absolutePath);
                if (A0G.A00() == 0) {
                    i2 = -1;
                    Axl.A00();
                    Axl.close();
                    StringBuilder A0f = C18280x3.A0f(A042);
                    A0f.append("ReferenceCountedFileManager/removeManagedFileReference removed ");
                    A0f.append(i);
                    C18260x0.A0w(" refs; refCount=", A0f, i2);
                    return i2;
                }
            }
            i2 = A002 - i;
            Axl.A00();
            Axl.close();
            StringBuilder A0f2 = C18280x3.A0f(A042);
            A0f2.append("ReferenceCountedFileManager/removeManagedFileReference removed ");
            A0f2.append(i);
            C18260x0.A0w(" refs; refCount=", A0f2, i2);
            return i2;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public File A02(String str) {
        File A012 = C64393Dh.A01(C54292oU.A01(this.A00), "Stickers");
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x2.A1M(A0o, str);
        return C18270x1.A0A(A012, ".webp", A0o);
    }

    public void A03(File file, byte b) {
        Log.i("ReferenceCountedFileManager/deleteManagedFile actually deleting file");
        C106695a0 r1 = this.A04;
        Log.d("MediaUtils/deleteManagedFile actually deleting file");
        C627536m.A0O(file);
        r1.A08(file, b);
    }

    public final void A05(File file, int i, boolean z) {
        C69833Yo Axl;
        if (!z) {
            i--;
        }
        AnonymousClass2Y6 r2 = this.A03;
        String absolutePath = file.getAbsolutePath();
        C18260x0.A0w("refcount/update delta=", AnonymousClass001.A0o(), i);
        if (i != 0) {
            C626936e.A0C(AnonymousClass001.A1W(i));
            C85284Fq A042 = r2.A01.A04();
            try {
                Axl = A042.Axl();
                C56862sg r3 = ((AnonymousClass3H0) A042).A03;
                C56702sQ A0G = r3.A0G("UPDATE media_refs SET ref_count = ref_count + ? WHERE path = ?", "UPDATE_MEDIA_REF_SQL");
                A0G.A06(1, (long) i);
                A0G.A07(2, absolutePath);
                if (A0G.A00() == 0) {
                    ContentValues A06 = AnonymousClass0x9.A06();
                    A06.put("path", absolutePath);
                    C18270x1.A0b(A06, "ref_count", i);
                    r3.A08("media_refs", "INSERT_TABLE_MEDIA_REFS", A06);
                }
                Axl.A00();
                Axl.close();
                A042.close();
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        C18260x0.A0w("ReferenceCountedFileManager/addedReference Added = ", AnonymousClass001.A0o(), i);
        return;
        throw th;
    }

    public C56352rq(C64393Dh r1, C49712gy r2, C54292oU r3, AnonymousClass2Y6 r4, C106695a0 r5, C60152y5 r6) {
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
    }

    public File A01(String str) {
        File A022 = A02(str);
        if (!A022.exists()) {
            return null;
        }
        A05(A022, 1, true);
        return A022;
    }

    public void A04(File file, int i, boolean z) {
        if (A07(file)) {
            A05(file, i, z);
        }
    }

    public void A06(String str) {
        File A022 = A02(str);
        if (A00(A022, 1) < 0) {
            Log.d("ReferenceCountedFileManager/removeInternalManagedFileReference actually deleting file");
            C627536m.A0O(A022);
        }
    }
}
