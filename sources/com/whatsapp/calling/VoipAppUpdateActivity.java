package com.whatsapp.calling;

import X.AnonymousClass2F7;
import X.AnonymousClass3DZ;
import X.AnonymousClass49O;
import X.AnonymousClass4HY;
import X.C005205m;
import X.C18310x6;
import X.C50382i5;
import X.C626936e;
import X.C64333Db;
import X.C86104Iv;
import X.C89704el;
import X.C989453v;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Locale;

public class VoipAppUpdateActivity extends C89704el {
    public C50382i5 A00;
    public AnonymousClass2F7 A01;
    public boolean A02;
    public final AnonymousClass49O A03;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            this.A04 = C64333Db.A8y(A002);
            this.A00 = (C50382i5) A002.AZG.get();
            this.A01 = (AnonymousClass2F7) A002.A00.A24.get();
        }
    }

    public VoipAppUpdateActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 23);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (getIntent().hasExtra("feature") || getIntent().hasExtra("feature_type")) {
            C18310x6.A0x(this, getWindow(), R.color.f5nameremoved);
            getWindow().addFlags(2621440);
            setContentView((int) R.layout.f8nameremoved);
            C005205m.A00(this, R.id.cancel).setOnClickListener(new C989453v(this, 45));
            C005205m.A00(this, R.id.upgrade).setOnClickListener(new C989453v(this, 46));
            AnonymousClass2F7 r0 = this.A01;
            r0.A00.add(this.A03);
            boolean hasExtra = getIntent().hasExtra("feature_type");
            Intent intent = getIntent();
            if (hasExtra) {
                i = intent.getIntExtra("feature_type", 0);
            } else {
                String upperCase = intent.getStringExtra("feature").toUpperCase(Locale.ROOT);
                if (!upperCase.equals("AUDIO_CHAT_RECEIVER")) {
                    i = 1;
                    if (!upperCase.equals("SCREEN_SHARING_RECEIVER")) {
                        i = 0;
                    }
                } else {
                    i = 2;
                }
            }
            TextView A012 = C005205m.A01(this, R.id.voip_app_update_dialog_title);
            int i2 = R.string.f11nameremoved;
            if (i != 2) {
                i2 = R.string.f11nameremoved;
            }
            A012.setText(getString(i2));
            TextView A013 = C005205m.A01(this, R.id.voip_app_update_dialog_content);
            int i3 = R.string.f11nameremoved;
            if (i != 2) {
                i3 = R.string.f11nameremoved;
            }
            A013.setText(getString(i3));
            return;
        }
        C626936e.A0D(false, "VoipAppUpdateActivity/onCreate no feature extra");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass2F7 r0 = this.A01;
        r0.A00.remove(this.A03);
    }

    public VoipAppUpdateActivity() {
        this(0);
        this.A03 = new C86104Iv(this, 0);
    }
}
