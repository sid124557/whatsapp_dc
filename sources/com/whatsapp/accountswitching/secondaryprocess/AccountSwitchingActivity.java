package com.whatsapp.accountswitching.secondaryprocess;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11o;
import X.C005205m;
import X.C009707r;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C71703cX;
import X.C71733ca;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import java.util.Locale;

public final class AccountSwitchingActivity extends C009707r {
    public Handler A00;

    public static final void A0C(ContentProviderClient contentProviderClient) {
        if (contentProviderClient == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            contentProviderClient.close();
        } else {
            contentProviderClient.release();
        }
    }

    public final void A5p(boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(getPackageName(), "com.whatsapp.Main");
        A07.putExtra("request_type", getIntent().getIntExtra("request_type", 0));
        A07.putExtra("is_success", z);
        A07.putExtra("source", getIntent().getIntExtra("source", 0));
        A07.putExtra("inactive_account_num_pending_message_notifs", getIntent().getIntExtra("inactive_account_num_pending_message_notifs", 0));
        A07.putExtra("switching_start_time_ms", getIntent().getLongExtra("switching_start_time_ms", 0));
        A07.putExtra("device_id", getIntent().getStringExtra("device_id"));
        A07.putExtra("phone_id", getIntent().getStringExtra("phone_id"));
        if (getIntent().hasExtra("phone_id_timestamp")) {
            A07.putExtra("phone_id_timestamp", getIntent().getLongExtra("phone_id_timestamp", 0));
        }
        A07.setFlags(268468224);
        if (getIntent().hasExtra("number_of_accounts")) {
            A07.putExtra("number_of_accounts", getIntent().getIntExtra("number_of_accounts", 0));
            A07.putExtra("account_language", getIntent().getStringExtra("account_language"));
        }
        if (getIntent().hasExtra("account_switching_sender_jid")) {
            A07.putExtra("account_switching_sender_jid", getIntent().getStringExtra("account_switching_sender_jid"));
        }
        A07.putExtra("is_missed_call_notification", getIntent().getBooleanExtra("is_missed_call_notification", false));
        getIntent().removeExtra("request_type");
        startActivity(A07);
        finish();
    }

    public final void A5q(boolean z) {
        A0C(getContentResolver().acquireUnstableContentProviderClient("com.whatsapp.accountswitching.AccountSwitchingContentProvider"));
        Handler handler = this.A00;
        if (handler == null) {
            throw C18270x1.A0S("mainThreadHandler");
        }
        handler.post(new C71703cX(5, (Object) this, z));
    }

    public void onCreate(Bundle bundle) {
        Context baseContext;
        super.onCreate(bundle);
        if (bundle == null) {
            this.A00 = AnonymousClass000.A0A();
            String stringExtra = getIntent().getStringExtra("account_language");
            if (stringExtra == null || stringExtra.length() == 0) {
                baseContext = getBaseContext();
            } else {
                baseContext = getBaseContext();
                C162457s7.A0D(baseContext);
                Locale forLanguageTag = Locale.forLanguageTag(stringExtra);
                if (forLanguageTag != null && !AnonymousClass001.A0M(baseContext).locale.equals(forLanguageTag)) {
                    if (Build.VERSION.SDK_INT < 26) {
                        Resources resources = baseContext.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.locale = forLanguageTag;
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                    } else {
                        Configuration configuration2 = new Configuration();
                        configuration2.setLocale(forLanguageTag);
                        baseContext = baseContext.createConfigurationContext(configuration2);
                        C162457s7.A0D(baseContext);
                    }
                }
            }
            int intExtra = getIntent().getIntExtra("request_type", 0);
            if (intExtra == 0) {
                A5p(false);
                return;
            }
            setContentView((int) R.layout.f8nameremoved);
            RecyclerView recyclerView = (RecyclerView) C18290x4.A0L(this, R.id.conversation_list_shimmer);
            recyclerView.setLayoutManager(new AccountSwitchingActivity$showShimmerTransition$layoutManager$1());
            recyclerView.setAdapter(new AnonymousClass11o((int) Math.ceil(((double) AnonymousClass000.A0B(this).heightPixels) / ((double) getResources().getDimensionPixelSize(R.dimen.f6nameremoved)))));
            View A002 = C005205m.A00(this, R.id.shimmer);
            C162457s7.A0K(A002, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            ((ShimmerFrameLayout) A002).A02();
            Handler handler = this.A00;
            if (handler == null) {
                throw C18270x1.A0S("mainThreadHandler");
            }
            handler.post(new C71733ca((Object) baseContext, (Object) this, intExtra, 9));
        }
    }
}
