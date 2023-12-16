package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9YU  reason: invalid class name */
public class AnonymousClass9YU implements C202879mj {
    public final /* synthetic */ AnonymousClass9SJ A00;

    public AnonymousClass9YU(AnonymousClass9SJ r1) {
        this.A00 = r1;
    }

    public void BSl(AnonymousClass9KQ r5) {
        C194289Sh r0 = this.A00.A00.A00;
        C195639Yw.A01(r0.A00, r0.A03, r0.A05, r0.A06, r5);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Throwable th;
        String str;
        Object[] objArr;
        AnonymousClass9JA r0;
        List list = (List) obj;
        C200849iz r8 = this.A00.A00;
        if (r8.A02.A02) {
            r8.A00.A00(new AnonymousClass9QT(AnonymousClass001.A0t()));
            return;
        }
        if (list != null) {
            try {
                if (!list.isEmpty() && ((C193209No) list.get(0)).A01.getCanonicalPath() != null) {
                    String canonicalPath = ((C193209No) list.get(0)).A01.getCanonicalPath();
                    Map map = r8.A01.A04;
                    Iterator A0q = AnonymousClass000.A0q(map);
                    while (A0q.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                        File file = new File(canonicalPath, (String) A0w.getValue());
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-1");
                            byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                            try {
                                if (file instanceof AnonymousClass9JA) {
                                    r0 = (AnonymousClass9JA) file;
                                } else {
                                    r0 = new AnonymousClass9JA(file);
                                }
                                BufferedInputStream A0c = AnonymousClass0x7.A0c(r0);
                                while (true) {
                                    int read = A0c.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    instance.update(bArr, 0, read);
                                }
                                AnonymousClass9UQ.A00(A0c);
                                byte[] digest = instance.digest();
                                char[] cArr = new char[40];
                                for (int i = 0; i < digest.length; i++) {
                                    byte b = digest[i] & 255;
                                    int i2 = i * 2;
                                    char[] cArr2 = AnonymousClass9UQ.A00;
                                    cArr[i2] = cArr2[b >>> 4];
                                    cArr[i2 + 1] = cArr2[b & 15];
                                }
                                if (!new String(cArr).equals(A0w.getValue())) {
                                    C194579Tm r2 = new C194579Tm();
                                    r2.A00 = AnonymousClass9K2.SCRIPTING_PACKAGE_FETCH_FAILURE;
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("Sha1 hash doesn't match: ");
                                    r2.A03 = AnonymousClass000.A0I(C18310x6.A0q(A0w), A0o);
                                    th = r2.A00();
                                    throw th;
                                }
                            } catch (FileNotFoundException e) {
                                e = e;
                                str = "Couldn't find the file: %s";
                                objArr = new Object[]{file.getPath()};
                            } catch (IOException e2) {
                                e = e2;
                                str = "Couldn't read the file: %s";
                                objArr = new Object[]{file.getPath()};
                            } catch (Throwable th2) {
                                th = th2;
                                AnonymousClass9UQ.A00((Closeable) null);
                            }
                        } catch (NoSuchAlgorithmException e3) {
                            th = new RuntimeException(e3);
                        }
                    }
                    C194289Sh r5 = r8.A00;
                    HashMap A0t = AnonymousClass001.A0t();
                    Iterator A0q2 = AnonymousClass000.A0q(map);
                    while (A0q2.hasNext()) {
                        Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                        A0t.put(A0w2.getKey(), new File(canonicalPath, (String) A0w2.getValue()).getPath());
                    }
                    r5.A00(new AnonymousClass9QT(A0t));
                    return;
                }
            } catch (IOException e4) {
                C194579Tm r1 = new C194579Tm();
                r1.A00 = AnonymousClass9K2.SCRIPTING_PACKAGE_FETCH_FAILURE;
                r1.A03 = e4;
                e = r1.A00();
            } catch (AnonymousClass9KQ e5) {
                e = e5;
            }
        }
        C194579Tm r12 = new C194579Tm();
        r12.A00 = AnonymousClass9K2.SCRIPTING_PACKAGE_FETCH_FAILURE;
        r12.A03 = AnonymousClass001.A0e("Scripting package asset download returned a null result");
        th = r12.A00();
        throw th;
        BSl(e);
        return;
        C162477s9.A0C("AssetFileUtil", str, e, objArr);
        AnonymousClass9UQ.A00((Closeable) null);
    }
}
