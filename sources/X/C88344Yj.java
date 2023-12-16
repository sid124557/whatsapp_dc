package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.4Yj  reason: invalid class name and case insensitive filesystem */
public class C88344Yj extends C05570Ua {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final C620733j A05;
    public final AnonymousClass4FV A06;
    public final StorageUsageMediaPreviewView A07;
    public final StorageUsageMediaPreviewView A08;

    public C88344Yj(View view, C620733j r5, AnonymousClass4FV r6) {
        super(view);
        this.A06 = r6;
        this.A05 = r5;
        View A022 = C06560Yg.A02(view, R.id.forwarded_files_container);
        this.A00 = A022;
        this.A02 = C18300x5.A0G(view, R.id.forwarded_files_size_text_view);
        this.A07 = (StorageUsageMediaPreviewView) C06560Yg.A02(view, R.id.forwarded_files_preview_view);
        View A023 = C06560Yg.A02(view, R.id.large_files_container);
        this.A01 = A023;
        this.A04 = C18300x5.A0G(view, R.id.large_files_title_text_view);
        this.A03 = C18300x5.A0G(view, R.id.large_files_size_text_view);
        this.A08 = (StorageUsageMediaPreviewView) C06560Yg.A02(view, R.id.large_files_preview_view);
        C107295b4.A02(A022);
        C107295b4.A02(A023);
    }
}
