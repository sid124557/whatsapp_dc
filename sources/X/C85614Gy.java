package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.4Gy  reason: invalid class name and case insensitive filesystem */
public class C85614Gy extends ClickableSpan {
    public Object A00;
    public final int A01;

    public C85614Gy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        if (this.A01 != 0) {
            ExportMigrationActivity exportMigrationActivity = (ExportMigrationActivity) this.A00;
            exportMigrationActivity.A0G.A00(exportMigrationActivity.A0J, 2);
            Intent A07 = C18320x8.A07();
            A07.setClassName(exportMigrationActivity.getPackageName(), "com.whatsapp.registration.ChangeNumberOverview");
            exportMigrationActivity.A00.A0A(exportMigrationActivity, A07);
            return;
        }
        RegisterAsCompanionLinkCodeActivity registerAsCompanionLinkCodeActivity = (RegisterAsCompanionLinkCodeActivity) this.A00;
        C47872dy r0 = registerAsCompanionLinkCodeActivity.A02;
        if (r0 != null) {
            r0.A00().A0A();
            registerAsCompanionLinkCodeActivity.finish();
            return;
        }
        throw C18270x1.A0S("companionRegistrationManager");
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.A01 != 0) {
            textPaint.setUnderlineText(false);
            Context context = (Context) this.A00;
            textPaint.setColor(AnonymousClass0Y8.A04(context, C18290x4.A00(context)));
            return;
        }
        C162457s7.A0J(textPaint, 0);
        textPaint.setColor(AnonymousClass0Y8.A04((Context) this.A00, R.color.f5nameremoved));
        textPaint.setUnderlineText(false);
    }
}
