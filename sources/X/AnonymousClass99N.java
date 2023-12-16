package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: X.99N  reason: invalid class name */
public class AnonymousClass99N extends C56782sY {
    public final C54292oU A00;
    public final C620733j A01;
    public final AnonymousClass33K A02;
    public final C85134Fb A03;
    public final C620933l A04;
    public final C55132pq A05;

    public synchronized File A01(String str) {
        File file;
        file = new File(this.A00.A00.getFilesDir(), str);
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    public boolean A03(File file) {
        if (file == null || file.length() == 0) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ String A04(Object obj) {
        return C18280x3.A0Z(this.A04.A03(), "payments_error_map_tag");
    }

    public /* bridge */ /* synthetic */ void A09(Object obj, String str) {
        C18270x1.A0j(C620933l.A00(this.A04), "payments_error_map_tag", str);
    }

    public /* bridge */ /* synthetic */ boolean A0B(InputStream inputStream, Object obj, Map map) {
        FileOutputStream fileOutputStream;
        File A012 = A01("payments_error_map.json");
        if (A012 != null) {
            C627536m.A0O(A012);
            Log.d("PAY:ErrorMapAssetManager/removeMetadataAsset/ map removed");
        }
        File A013 = super.A01("");
        if (A013 == null) {
            Log.e("PAY:ErrorMapAssetManager/storeAssets/ Could not prepare resource directory");
            return false;
        }
        Log.d("PAY:ErrorMapAssetManager/storeAssets/storing file");
        try {
            fileOutputStream = new FileOutputStream(new File(A013.getAbsolutePath(), "payments_error_map.json"));
            C627536m.A0I(inputStream, fileOutputStream);
            fileOutputStream.close();
            Log.d("PAY:ErrorMapAssetManager/storeAssets/stored");
            return true;
        } catch (IOException e) {
            Log.e("PAY:ErrorMapAssetManager/store Failed!", e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ boolean A0C(Object obj) {
        return !A03(A01("payments_error_map.json"));
    }

    public void A0E() {
        File A012;
        C196549b3 r8 = new C196549b3(this);
        C620933l r1 = this.A04;
        if (r1.A01.A0H() - r1.A03().getLong("payments_error_map_last_sync_time_millis", (System.currentTimeMillis() - 604800000) - 1) > 604800000 || A0F()) {
            if (A0F() && (A012 = A01("payments_error_map.json")) != null) {
                C627536m.A0O(A012);
                Log.d("PAY:ErrorMapAssetManager/removeMetadataAsset/ map removed");
            }
            Log.d("PAY:ErrorMapAssetManager/triggerBackgroundFetch/calling fetchAssets");
            String B65 = this.A03.B65();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("https://static.whatsapp.net/payments/error_map?product_type=payments_p2p_fbpay&country=");
            A0o.append(B65);
            A0o.append("&lg=");
            A0o.append(this.A01.A07());
            A0o.append("&platform=android&app_type=");
            A0o.append("CONSUMER");
            A0o.append("&api_version=");
            super.A02(r8, (AnonymousClass486) null, (Object) null, AnonymousClass000.A0X("1", A0o), (String) null, (Map) null);
        }
    }

    public boolean A0F() {
        String A0Z = C18280x3.A0Z(this.A04.A03(), "error_map_key");
        String B65 = this.A03.B65();
        if (A0Z == null) {
            return true;
        }
        String[] split = A0Z.split("_");
        if (!split[0].equals(B65) || !split[1].equals(this.A01.A07()) || !split[2].equals("1")) {
            return true;
        }
        return false;
    }

    public AnonymousClass99N(C56492s4 r8, C54292oU r9, C620733j r10, AnonymousClass33K r11, C85134Fb r12, C620933l r13, C55132pq r14, AnonymousClass4FS r15) {
        super(r8, r9, r11, r14, r15, C18320x8.A0W());
        this.A00 = r9;
        this.A01 = r10;
        this.A05 = r14;
        this.A02 = r11;
        this.A04 = r13;
        this.A03 = r12;
    }

    public boolean A0A() {
        return true;
    }

    public boolean A0D(String str, Map map, byte[] bArr) {
        return true;
    }
}
