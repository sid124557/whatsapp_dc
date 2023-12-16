package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.GroupAddPrivacyActivity;
import com.whatsapp.profile.AboutStatusPrivacyActivity;
import com.whatsapp.profile.ProfilePhotoBlockListPickerActivity;
import com.whatsapp.profile.ProfilePhotoPrivacyActivity;

/* renamed from: X.1HD  reason: invalid class name */
public abstract class AnonymousClass1HD extends C89644eZ implements AnonymousClass492 {
    public RadioButton A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioButton A03;
    public C55912r7 A04;
    public boolean A05 = false;
    public final C49232gC A06 = new C49232gC();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.whatsapp.profile.AboutStatusPrivacyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.whatsapp.profile.ProfilePhotoPrivacyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.profile.AboutStatusPrivacyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.whatsapp.profile.AboutStatusPrivacyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.whatsapp.profile.AboutStatusPrivacyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.whatsapp.profile.AboutStatusPrivacyActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A74() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof com.whatsapp.profile.ProfilePhotoPrivacyActivity
            if (r0 == 0) goto L_0x001b
            r3 = r4
            com.whatsapp.profile.ProfilePhotoPrivacyActivity r3 = (com.whatsapp.profile.ProfilePhotoPrivacyActivity) r3
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0017
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "profile_photo"
            int r0 = r3.A00
            X.AnonymousClass1Ha.A1u(r3, r2, r1, r0)
        L_0x0017:
            r3.finish()
            return
        L_0x001b:
            boolean r0 = r4 instanceof com.whatsapp.profile.AboutStatusPrivacyActivity
            if (r0 == 0) goto L_0x0032
            r3 = r4
            com.whatsapp.profile.AboutStatusPrivacyActivity r3 = (com.whatsapp.profile.AboutStatusPrivacyActivity) r3
            int r2 = r3.A00
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0017
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "about"
            X.AnonymousClass1Ha.A1u(r3, r1, r0, r2)
            goto L_0x0017
        L_0x0032:
            r2 = r4
            com.whatsapp.group.GroupAddPrivacyActivity r2 = (com.whatsapp.group.GroupAddPrivacyActivity) r2
            int r1 = r2.A00
            r0 = 2
            if (r1 == r0) goto L_0x0047
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0047
            com.whatsapp.invites.NobodyDeprecatedDialogFragment r0 = new com.whatsapp.invites.NobodyDeprecatedDialogFragment
            r0.<init>()
            r2.Boo(r0)
            return
        L_0x0047:
            r2.A79()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HD.A74():void");
    }

    public void A75() {
        if (this instanceof ProfilePhotoPrivacyActivity) {
            startActivityForResult(AnonymousClass0x9.A08(this, ProfilePhotoBlockListPickerActivity.class), 1);
        } else if (this instanceof AboutStatusPrivacyActivity) {
            Intent A07 = C18320x8.A07();
            A07.setClassName(getPackageName(), "com.whatsapp.profile.AboutStatusBlockListPickerActivity");
            startActivityForResult(A07, 1);
        } else {
            GroupAddPrivacyActivity groupAddPrivacyActivity = (GroupAddPrivacyActivity) this;
            boolean z = groupAddPrivacyActivity.A03;
            Intent A072 = C18320x8.A07();
            A072.setClassName(groupAddPrivacyActivity.getPackageName(), "com.whatsapp.group.GroupAddBlacklistPickerActivity");
            A072.putExtra("was_nobody", z);
            groupAddPrivacyActivity.startActivityForResult(A072, 1);
        }
    }

    public void A76() {
        String str;
        int i;
        boolean z = false;
        if (!this.A05) {
            if (this instanceof ProfilePhotoPrivacyActivity) {
                i = ((ProfilePhotoPrivacyActivity) this).A00;
            } else if (this instanceof AboutStatusPrivacyActivity) {
                i = ((AboutStatusPrivacyActivity) this).A00;
            } else {
                i = ((GroupAddPrivacyActivity) this).A00;
            }
            this.A01.setChecked(AnonymousClass000.A1U(i, 1));
            this.A00.setChecked(AnonymousClass000.A1T(i));
            this.A03.setChecked(AnonymousClass000.A1U(i, 2));
            RadioButton radioButton = this.A02;
            if (i == 3) {
                z = true;
            }
            radioButton.setChecked(z);
            return;
        }
        if (this instanceof ProfilePhotoPrivacyActivity) {
            str = "profile";
        } else if (this instanceof AboutStatusPrivacyActivity) {
            str = "status";
        } else {
            str = "groupadd";
        }
        int A012 = this.A04.A01(str);
        Object obj = this.A04.A07.get(str);
        boolean z2 = true;
        if (obj == null) {
            z2 = false;
            this.A06.A00();
        }
        A78(this.A01, A012, 1, z2);
        A78(this.A00, A012, 0, z2);
        A78(this.A03, A012, 2, z2);
        A78(this.A02, A012, 3, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.group.GroupAddPrivacyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.whatsapp.profile.AboutStatusPrivacyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.whatsapp.profile.ProfilePhotoPrivacyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.whatsapp.group.GroupAddPrivacyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.whatsapp.group.GroupAddPrivacyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.whatsapp.group.GroupAddPrivacyActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A77(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0029
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.profile.ProfilePhotoPrivacyActivity
            if (r0 == 0) goto L_0x0011
            com.whatsapp.profile.ProfilePhotoPrivacyActivity r1 = (com.whatsapp.profile.ProfilePhotoPrivacyActivity) r1
            r0 = 3
            if (r4 == r0) goto L_0x0025
            r1.A00 = r4
            return
        L_0x0011:
            boolean r0 = r3 instanceof com.whatsapp.profile.AboutStatusPrivacyActivity
            if (r0 == 0) goto L_0x001d
            com.whatsapp.profile.AboutStatusPrivacyActivity r1 = (com.whatsapp.profile.AboutStatusPrivacyActivity) r1
            r0 = 3
            if (r4 == r0) goto L_0x0025
            r1.A00 = r4
            return
        L_0x001d:
            com.whatsapp.group.GroupAddPrivacyActivity r1 = (com.whatsapp.group.GroupAddPrivacyActivity) r1
            r0 = 3
            if (r4 == r0) goto L_0x0025
            r1.A00 = r4
            return
        L_0x0025:
            r1.A75()
            return
        L_0x0029:
            r0 = 3
            if (r4 != r0) goto L_0x0030
            r3.A75()
            return
        L_0x0030:
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.group.GroupAddPrivacyActivity
            if (r0 == 0) goto L_0x0049
            com.whatsapp.group.GroupAddPrivacyActivity r1 = (com.whatsapp.group.GroupAddPrivacyActivity) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0049
            r0 = 2
            if (r4 == r0) goto L_0x0049
            r1.A01 = r4
            com.whatsapp.invites.NobodyDeprecatedDialogFragment r0 = new com.whatsapp.invites.NobodyDeprecatedDialogFragment
            r0.<init>()
            r1.Boo(r0)
            return
        L_0x0049:
            X.2r7 r2 = r3.A04
            boolean r0 = r3 instanceof com.whatsapp.profile.ProfilePhotoPrivacyActivity
            if (r0 == 0) goto L_0x005a
            java.lang.String r1 = "profile"
        L_0x0052:
            java.lang.String r0 = X.AnonymousClass35B.A03(r1, r4)
            r2.A05(r1, r0)
            return
        L_0x005a:
            boolean r0 = r3 instanceof com.whatsapp.profile.AboutStatusPrivacyActivity
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = "status"
            goto L_0x0052
        L_0x0062:
            java.lang.String r1 = "groupadd"
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HD.A77(int):void");
    }

    public final void A78(RadioButton radioButton, int i, int i2, boolean z) {
        if (i != i2 || !z) {
            radioButton.setChecked(AnonymousClass000.A1U(i, i2));
        } else {
            this.A06.A01(radioButton);
        }
    }

    public void onBackPressed() {
        if (!this.A05) {
            A74();
        } else {
            finish();
        }
    }

    public void BbP() {
        A76();
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        super.onCreate(bundle);
        this.A05 = this.A0D.A0Y(C58422vE.A02, 5611);
        boolean z = this instanceof ProfilePhotoPrivacyActivity;
        if (z) {
            i = R.layout.f8nameremoved;
        } else {
            i = R.layout.f8nameremoved;
        }
        AnonymousClass0R8 A1m = AnonymousClass1Ha.A1m(this, i);
        if (z) {
            i2 = R.string.f11nameremoved;
        } else if (this instanceof AboutStatusPrivacyActivity) {
            i2 = R.string.f11nameremoved;
        } else {
            i2 = R.string.f11nameremoved;
        }
        A1m.A0B(i2);
        this.A01 = (RadioButton) findViewById(R.id.my_contacts_button);
        this.A00 = (RadioButton) findViewById(R.id.everyone_btn);
        this.A02 = (RadioButton) findViewById(R.id.my_contacts_except_button);
        this.A03 = (RadioButton) findViewById(R.id.nobody_btn);
        TextView A0L = C18310x6.A0L(this, R.id.header);
        if (z) {
            i3 = R.string.f11nameremoved;
        } else if (this instanceof AboutStatusPrivacyActivity) {
            i3 = R.string.f11nameremoved;
        } else {
            i3 = R.string.f11nameremoved;
        }
        A0L.setText(i3);
        if (z || (this instanceof AboutStatusPrivacyActivity)) {
            AnonymousClass1Ha.A20(this, R.id.footer);
        } else {
            C18310x6.A0L(this, R.id.footer).setText(R.string.f11nameremoved);
        }
        this.A01.setText(R.string.f11nameremoved);
        this.A00.setText(R.string.f11nameremoved);
        this.A02.setText(R.string.f11nameremoved);
        this.A03.setText(R.string.f11nameremoved);
        C633939b.A00(this.A01, this, 12);
        C633939b.A00(this.A00, this, 13);
        C633939b.A00(this.A02, this, 14);
        C633939b.A00(this.A03, this, 15);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (!this.A05) {
            A74();
            return false;
        }
        finish();
        return false;
    }

    public void onPause() {
        super.onPause();
        this.A04.A08.remove(this);
    }

    public void onResume() {
        super.onResume();
        if (this.A05) {
            this.A04.A08.add(this);
        }
        A76();
    }
}
