package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2zE  reason: invalid class name and case insensitive filesystem */
public class C60822zE {
    public static final Comparator A04 = new AnonymousClass4IU(38);
    public final C64393Dh A00;
    public final C55732qp A01;
    public final AnonymousClass2I9 A02;
    public final WebpUtils A03;

    public final synchronized List A01(String str, String str2, String str3) {
        List list;
        File A002 = A00(str, str2);
        if (A002.exists()) {
            File[] listFiles = A002.listFiles();
            Arrays.sort(listFiles, A04);
            int length = listFiles.length;
            ArrayList A0I = AnonymousClass002.A0I(length);
            String A012 = AnonymousClass336.A01(str, str2);
            int i = 0;
            while (true) {
                if (i >= length) {
                    A0I.size();
                    list = Collections.unmodifiableList(A0I);
                    break;
                }
                File file = listFiles[i];
                String name = file.getName();
                String decode = Uri.decode(C627536m.A09(name.substring(3)));
                AnonymousClass39M r3 = new AnonymousClass39M();
                r3.A0D = decode;
                r3.A09 = AnonymousClass002.A0A(A002, name).getAbsolutePath();
                r3.A01 = 2;
                r3.A0C = "image/webp";
                r3.A03 = 512;
                r3.A02 = 512;
                r3.A0A = WebpUtils.A00(file);
                r3.A0F = A012;
                AnonymousClass330 A013 = this.A01.A01(r3.A04(), file.getAbsolutePath());
                if (A013 != null) {
                    r3.A04 = A013;
                }
                if (AnonymousClass000.A1W(str3)) {
                    if (TextUtils.equals(str3, decode)) {
                        A0I.size();
                        list = Collections.singletonList(r3);
                        break;
                    }
                }
                A0I.add(r3);
                i++;
            }
        } else {
            list = Collections.emptyList();
        }
        return list;
    }

    public synchronized void A02(String str, String str2, List list) {
        IllegalStateException illegalStateException;
        StringBuilder A0o;
        InputStream inputStream;
        if (list.size() < 100) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("ThirdPartyStickerStorage/addStickersInPack/authority: ");
            A0o2.append(str);
            C18260x0.A0q(", identifier: ", str2, A0o2);
            File A002 = A00(str, str2);
            C627536m.A0G(A002, (Set) null);
            if (A002.exists() || A002.mkdirs()) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    AnonymousClass39M r6 = (AnonymousClass39M) list.get(i);
                    String str3 = r6.A0D;
                    if (i >= 100) {
                        illegalStateException = AnonymousClass001.A0e(AnonymousClass000.A0Y("ThirdPartyStickerStorage/createStickerFileName/sticker index is more more than 100. Index: ", AnonymousClass001.A0o(), i));
                        break;
                    }
                    if (i < 10) {
                        A0o = AnonymousClass001.A0o();
                        A0o.append("0");
                    } else {
                        A0o = AnonymousClass001.A0o();
                    }
                    A0o.append(i);
                    A0o.append("_");
                    A0o.append(Uri.encode(str3));
                    File A0A = C18270x1.A0A(A002, ".webp", A0o);
                    try {
                        AnonymousClass2I9 r4 = this.A02;
                        try {
                            inputStream = C620633i.A02(r4.A00).A06(Uri.parse(r6.A09));
                            if (inputStream != null) {
                                if (C627536m.A0R(A0A, inputStream)) {
                                    if (r6.A04 != null) {
                                        this.A03.A03(A0A, r6.A04.A02());
                                    }
                                    A0A.getAbsolutePath();
                                    inputStream.close();
                                    i++;
                                }
                            }
                        } catch (FileNotFoundException e) {
                            Log.e("error openUri", e);
                            inputStream = null;
                        }
                        C627536m.A0G(A002, (Set) null);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException e2) {
                        Log.e("error closing the input stream.", e2);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                }
            } else {
                A002.getAbsolutePath();
            }
        } else {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            AnonymousClass000.A1H("ThirdPartyStickerStorage/addStickersInPack/total amount of stickers in pack is more than 100, size: ", A0o3, list);
            illegalStateException = AnonymousClass001.A0e(A0o3.toString());
        }
        throw illegalStateException;
        return;
        throw th;
    }

    public C60822zE(C64393Dh r2, C620633i r3, C55732qp r4, WebpUtils webpUtils) {
        AnonymousClass2I9 r0 = new AnonymousClass2I9(r3);
        this.A03 = webpUtils;
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = r0;
    }

    public final File A00(String str, String str2) {
        File A012 = C64393Dh.A01(C54292oU.A02(this.A00.A01), "stickers_cache");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(Uri.encode(str));
        A0o.append(File.separatorChar);
        return C18270x1.A0A(A012, Uri.encode(str2), A0o);
    }
}
