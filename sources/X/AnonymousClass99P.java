package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.99P  reason: invalid class name */
public class AnonymousClass99P extends C56782sY {
    public static final int A0E = ((int) TimeUnit.MINUTES.toMillis(60));
    public static final String A0F;
    public static final String A0G = C59482wz.A03;
    public static final String A0H;
    public AnonymousClass99X A00;
    public Long A01;
    public String A02;
    public boolean A03;
    public final C69263Wi A04;
    public final AnonymousClass8nX A05;
    public final C56612sH A06;
    public final C54292oU A07;
    public final AnonymousClass33p A08;
    public final C620733j A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass4FV A0B;
    public final C1907099n A0C;
    public final C49912hI A0D;

    public boolean A0D(String str, Map map, byte[] bArr) {
        String A0X;
        try {
            return !TextUtils.isEmpty(str) && AnonymousClass9LN.A00(str, bArr);
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("BloksAssetManager/verifySignature: ");
            String A0o2 = C18310x6.A0o(A00(this), AnonymousClass9M3.A00);
            if (TextUtils.isEmpty(A0o2)) {
                A0X = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
            } else {
                A0X = AnonymousClass000.A0X("_p", AnonymousClass000.A0l(A0o2));
            }
            A0o.append(A0X);
            C18260x0.A1Q(A0o, "Exception:", e);
            return false;
        }
    }

    public void A0F(C85034Er r12, String str, boolean z) {
        String A0X;
        this.A03 = z;
        this.A02 = str;
        C85034Er r3 = r12;
        if (this.A09) {
            this.A06.BkM(new C199869hP(this, r12));
            return;
        }
        String str2 = null;
        if (TextUtils.isEmpty((CharSequence) null)) {
            str2 = "2.23.26.14";
        }
        AnonymousClass1VX r5 = this.A0A;
        C49912hI r6 = this.A0D;
        String A0o = C18310x6.A0o(A00(this), AnonymousClass9M3.A00);
        if (TextUtils.isEmpty(A0o)) {
            A0X = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        } else {
            A0X = AnonymousClass000.A0X("_p", AnonymousClass000.A0l(A0o));
        }
        super.A02(r3, (AnonymousClass486) null, (Object) null, AnonymousClass351.A02(r5, r6, A0X, this.A09.A07(), (String) null, str2), (String) null, (Map) null);
    }

    public static String A00(AnonymousClass99P r0) {
        return C161357pU.A01(((C196109aJ) r0.A05).A02.A0Z()).A03;
    }

    public /* bridge */ /* synthetic */ String A04(Object obj) {
        return C18280x3.A0Z(AnonymousClass0x2.A0F(this.A08), "bloks_local_tag");
    }

    public void A07() {
        AnonymousClass33p r3 = this.A08;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("2.23.26.14");
        A0o.append(A00(this));
        A0o.append(" ");
        C18270x1.A0j(r3.A0U(), "bloks_version", AnonymousClass000.A0X(this.A09.A07(), A0o));
    }

    public /* bridge */ /* synthetic */ void A09(Object obj, String str) {
        C18270x1.A0j(this.A08.A0U(), "bloks_local_tag", str);
    }

    public /* bridge */ /* synthetic */ boolean A0B(InputStream inputStream, Object obj, Map map) {
        FileOutputStream fileOutputStream;
        File A012 = A01(A0F);
        if (A012 != null) {
            C627536m.A0P(A012);
        }
        File A013 = A01(A0G);
        File A014 = A01(A0H);
        if (A013 == null || A014 == null) {
            Log.e("BloksAssetManager/store/Could not prepare resource subdirectory");
            return false;
        }
        Log.d("BloksAssetManager/store/Storing files.");
        try {
            ZipInputStream zipInputStream = new ZipInputStream(inputStream);
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String A082 = C627536m.A08(nextEntry.getName());
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append(C627536m.A09(nextEntry.getName()));
                        String A0V = AnonymousClass000.A0V(".", A082, A0o);
                        if ("png".equals(A082)) {
                            File A062 = C627536m.A06(A013.getCanonicalPath(), nextEntry.getName());
                            if (A062 == null) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("BloksAssetManager/store/malicious zip file: ");
                                C18260x0.A1K(A0o2, nextEntry.getName());
                                zipInputStream.close();
                                return false;
                            }
                            File parentFile = A062.getParentFile();
                            if (!parentFile.exists()) {
                                C18260x0.A1P(AnonymousClass001.A0o(), "BloksAssetManager/store/creating folder", parentFile);
                                parentFile.mkdirs();
                            }
                            fileOutputStream = new FileOutputStream(A062);
                            C627536m.A0I(zipInputStream, fileOutputStream);
                            fileOutputStream.close();
                            C18260x0.A1P(AnonymousClass001.A0o(), "BloksAssetManager/store/stored image", A062);
                        } else if ("json".equals(A082)) {
                            fileOutputStream = new FileOutputStream(new File(A014.getAbsolutePath(), A0V));
                            C627536m.A0I(zipInputStream, fileOutputStream);
                            fileOutputStream.close();
                            C18260x0.A0q("BloksAssetManager/store/stored layout", A0V, AnonymousClass001.A0o());
                        }
                    } else {
                        zipInputStream.close();
                        return true;
                    }
                } catch (Throwable th) {
                    zipInputStream.close();
                    throw th;
                }
            }
        } catch (IOException e) {
            Log.e("BloksAssetManager/store/Failed!", e);
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public final AnonymousClass99X A0E() {
        AnonymousClass99X r2 = new AnonymousClass99X();
        int i = 0;
        if ("BR".equals(A00(this))) {
            i = 4;
        }
        r2.A02 = Long.valueOf((long) i);
        r2.A05 = "2.23.26.14";
        r2.A01 = Boolean.valueOf(this.A03);
        r2.A06 = this.A02;
        return r2;
    }

    public boolean A0G() {
        if (A03(A01(A0G)) || A03(A01(A0H))) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("downloadable");
        String str = File.separator;
        A0o.append(str);
        String A0X = AnonymousClass000.A0X("bloks_pay", A0o);
        A0F = A0X;
        A0H = AnonymousClass000.A0X("layout", AnonymousClass000.A0m(A0X, str));
    }

    public AnonymousClass99P(C69263Wi r9, C56492s4 r10, AnonymousClass8nX r11, C56612sH r12, C54292oU r13, AnonymousClass33p r14, C620733j r15, AnonymousClass1VX r16, AnonymousClass4FV r17, AnonymousClass33K r18, C1907099n r19, C49912hI r20, C55132pq r21, AnonymousClass4FS r22) {
        super(r10, r13, r18, r21, r22, C18320x8.A0W());
        this.A06 = r12;
        this.A0A = r16;
        this.A04 = r9;
        this.A07 = r13;
        this.A0B = r17;
        this.A09 = r15;
        this.A05 = r11;
        this.A08 = r14;
        this.A0C = r19;
        this.A0D = r20;
        this.A00 = 15;
        this.A01 = 4;
    }

    public void A05() {
        AnonymousClass99X A0E2 = A0E();
        this.A00 = A0E2;
        A0E2.A00 = Boolean.FALSE;
        A0E2.A04 = Long.valueOf(this.A06.A0H() - this.A01.longValue());
        this.A0B.BhD(this.A00);
    }

    public void A06() {
        this.A00 = A0E();
        this.A01 = Long.valueOf(this.A06.A0H());
        this.A0B.BhD(this.A00);
    }

    public void A08(int i) {
        AnonymousClass99X A0E2 = A0E();
        this.A00 = A0E2;
        A0E2.A00 = Boolean.TRUE;
        A0E2.A03 = Long.valueOf((long) i);
        A0E2.A04 = Long.valueOf(this.A06.A0H() - this.A01.longValue());
        this.A0B.BhD(this.A00);
    }

    public /* bridge */ /* synthetic */ boolean A0C(Object obj) {
        return A0G();
    }

    public boolean A0H() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("2.23.26.14");
        A0o.append(A00(this));
        A0o.append(" ");
        return AnonymousClass000.A0X(this.A09.A07(), A0o).equals(C18280x3.A0Z(AnonymousClass0x2.A0F(this.A08), "bloks_version"));
    }

    public boolean A0A() {
        return true;
    }
}
