package X;

import android.content.Intent;
import com.whatsapp.inappbugreporting.BugReportingCategoriesActivity;

/* renamed from: X.8YC  reason: invalid class name */
public final class AnonymousClass8YC extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BugReportingCategoriesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YC(BugReportingCategoriesActivity bugReportingCategoriesActivity) {
        super(1);
        this.this$0 = bugReportingCategoriesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C149077Kv r4 = (C149077Kv) obj;
        C162457s7.A0J(r4, 0);
        Intent intent = new Intent();
        intent.putExtra("bug_category_title", r4.A02);
        intent.putExtra("bug_category_type", r4.A00);
        this.this$0.setResult(-1, intent);
        this.this$0.finish();
        return C59022wD.A00;
    }
}
