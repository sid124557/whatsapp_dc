package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.util.Log;

/* renamed from: X.4bO  reason: invalid class name and case insensitive filesystem */
public abstract class C89044bO extends AnonymousClass4LB {
    public int A00 = 0;
    public ProgressBar A01;
    public TextView A02;
    public GoogleDriveRestoreAnimationView A03;
    public final C625835r A04;
    public final C72303dV A05;
    public final AnonymousClass317 A06;

    public void A00(int i) {
        this.A00 = i;
        if (i == 1) {
            if (this.A03 == null) {
                this.A03 = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_animation_view);
            }
            findViewById(R.id.restore_actions_view).setVisibility(8);
            findViewById(R.id.restore_animation_view).setVisibility(0);
            this.A01 = (ProgressBar) findViewById(R.id.progress);
            this.A02 = (TextView) findViewById(R.id.progress_info);
            this.A01.setVisibility(0);
            this.A01.setIndeterminate(true);
            AnonymousClass0Y8.A04(getContext(), AnonymousClass34K.A01(getContext(), R.attr.f3nameremoved));
            this.A02.setVisibility(0);
            this.A03.A05();
        } else if (i == 2) {
            GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A03;
            if (googleDriveRestoreAnimationView == null) {
                googleDriveRestoreAnimationView = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_animation_view);
                this.A03 = googleDriveRestoreAnimationView;
            }
            googleDriveRestoreAnimationView.A08(false);
            findViewById(R.id.restore_actions_view).setVisibility(8);
            ProgressBar progressBar = this.A01;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.A02;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) findViewById(R.id.msgrestore_result_box);
            textView2.setVisibility(0);
            C620733j r7 = this.A04;
            C72303dV r2 = this.A05;
            long A012 = (long) r2.A01();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, r2.A01(), 0);
            String A0L = r7.A0L(objArr, R.plurals.f9nameremoved, A012);
            C18260x0.A0s("RestoreFromBackupDialog/after-msgstore-verified/ ", A0L, AnonymousClass001.A0o());
            textView2.setText(A0L);
            findViewById(R.id.next_btn).setVisibility(0);
        }
    }

    public C89044bO(Activity activity, C620633i r9, C56612sH r10, C620733j r11, C625835r r12, C72303dV r13, AnonymousClass317 r14) {
        super(activity, r9, r10, r11, R.layout.f8nameremoved);
        this.A04 = r12;
        this.A05 = r13;
        this.A06 = r14;
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        C107405bG.A02(AnonymousClass34K.A01(getContext(), R.attr.f3nameremoved), this);
        AnonymousClass0x2.A0y(findViewById(R.id.perform_restore), this, 33);
        AnonymousClass0x2.A0y(findViewById(R.id.dont_restore), this, 34);
        AnonymousClass0x2.A0y(findViewById(R.id.next_btn), this, 35);
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("state");
        }
        A00(i);
        Window window = getWindow();
        C626936e.A06(window);
        window.setSoftInputMode(3);
        setTitle(R.string.f11nameremoved);
        C620733j r6 = this.A04;
        Log.d("RestoreFromBackupDialog/lastbackup/look at files");
        long A0D = this.A04.A0D();
        if (A0D != -1) {
            C18260x0.A10("RestoreFromBackupDialog/lastbackup/fromfiles/set to ", AnonymousClass001.A0o(), A0D);
        }
        String charSequence = C107565bW.A03(r6, A0D).toString();
        Activity activity = this.A01;
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = charSequence;
        AnonymousClass001.A0y(activity, (TextView) findViewById(R.id.restore_info), A0L, R.string.f11nameremoved);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A06.A09();
        Activity activity = this.A01;
        activity.startActivity(C627736r.A01(activity));
        return true;
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
