package X;

import com.whatsapp.WaTextView;
import com.whatsapp.inappbugreporting.BugReportingCategoriesActivity;

/* renamed from: X.6Ho  reason: invalid class name */
public final class AnonymousClass6Ho extends C04640Qa {
    public final /* synthetic */ WaTextView A00;
    public final /* synthetic */ BugReportingCategoriesActivity A01;
    public final /* synthetic */ AnonymousClass5UY A02;

    public AnonymousClass6Ho(WaTextView waTextView, BugReportingCategoriesActivity bugReportingCategoriesActivity, AnonymousClass5UY r3) {
        this.A01 = bugReportingCategoriesActivity;
        this.A02 = r3;
        this.A00 = waTextView;
    }

    public void A05() {
        AnonymousClass4XE r0 = this.A01.A01;
        if (r0 == null) {
            throw C18270x1.A0S("bugCategoryListAdapter");
        }
        int size = r0.A00.size();
        AnonymousClass5UY r02 = this.A02;
        if (size == 0) {
            r02.A06(0);
            this.A00.setVisibility(8);
            return;
        }
        r02.A06(8);
        this.A00.setVisibility(0);
    }
}
