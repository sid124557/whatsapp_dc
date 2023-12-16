package X;

import android.graphics.Bitmap;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.8Gh  reason: invalid class name and case insensitive filesystem */
public class C171238Gh implements C84584Cx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8GZ A01;
    public final /* synthetic */ StorageUsageMediaPreviewView A02;
    public final /* synthetic */ String A03;

    public C171238Gh(AnonymousClass8GZ r1, StorageUsageMediaPreviewView storageUsageMediaPreviewView, String str, int i) {
        this.A02 = storageUsageMediaPreviewView;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = str;
    }

    public Bitmap BJk() {
        Bitmap Bqg = this.A01.Bqg(this.A00);
        if (Bqg == null) {
            return StorageUsageMediaPreviewView.A0C;
        }
        return Bqg;
    }

    public String BDW() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01.A02);
        return AnonymousClass000.A0X(this.A03, A0o);
    }
}
