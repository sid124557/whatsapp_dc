package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.338  reason: invalid class name */
public class AnonymousClass338 {
    public final C56972sr A00;
    public final C44772Xk A01;
    public final C620633i A02;
    public final AnonymousClass33p A03;
    public final C620733j A04;
    public final C60152y5 A05;
    public final AnonymousClass4FS A06;

    public static final boolean A00(AnonymousClass5UR r2, String str, ArrayList arrayList) {
        try {
            C162457s7.A0D(r2.A02().applyBatch("com.android.contacts", arrayList));
            arrayList.clear();
            return true;
        } catch (Exception e) {
            C18260x0.A0u("androidcontactssync/", str, AnonymousClass001.A0o(), e);
            arrayList.clear();
            return false;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final Account A01(AccountManager accountManager, Context context) {
        if (C56972sr.A04(this.A00) == null) {
            Log.e("androidcontactssync/get-or-create-account null jid");
            return null;
        }
        Account account = new Account(C18320x8.A0a(context), "com.whatsapp");
        if (accountManager.addAccountExplicitly(account, (String) null, (Bundle) null)) {
            ContentResolver.setIsSyncable(account, "com.android.contacts", 1);
            return account;
        }
        Log.e("androidcontactssync/get-or-create-account failed to add account");
        return null;
    }

    public Account A02(Context context) {
        Account account;
        AccountManager accountManager = AccountManager.get(context);
        Account[] accountsByType = accountManager.getAccountsByType("com.whatsapp");
        if (accountsByType.length == 0) {
            account = A01(accountManager, context);
            if (account == null) {
                return null;
            }
        } else {
            account = accountsByType[0];
            if (!TextUtils.equals(C18320x8.A0a(context), account.name)) {
                accountManager.removeAccount(account, (AccountManagerCallback) null, (Handler) null);
                account = A01(accountManager, context);
                if (account == null) {
                    return null;
                }
            }
        }
        try {
            if (!ContentResolver.getSyncAutomatically(account, "com.android.contacts")) {
                ContentResolver.setSyncAutomatically(account, "com.android.contacts", true);
            }
            ContentResolver.addPeriodicSync(account, "com.android.contacts", AnonymousClass002.A08(), 3600);
            return account;
        } catch (NullPointerException e) {
            if (e.getMessage() != null && e.getMessage().startsWith("Attempt to invoke virtual method 'com.prism.gaia")) {
                return account;
            }
            throw e;
        }
    }

    public final synchronized void A03(Account account, Context context) {
        synchronized (this) {
            Account account2 = account;
            Uri A0H = C18290x4.A0H(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", account2.name).appendQueryParameter("account_type", account2.type), "caller_is_syncadapter", "true");
            Uri A0H2 = C18290x4.A0H(ContactsContract.Data.CONTENT_URI.buildUpon(), "caller_is_syncadapter", "true");
            ArrayList A0s = AnonymousClass001.A0s();
            C620633i r4 = this.A02;
            Cursor A032 = r4.A0R().A03(A0H, new String[]{"_id", "sync1", "sync2", "display_name"}, (String) null, (String[]) null, (String) null);
            if (A032 != null) {
                try {
                    int columnIndexOrThrow = A032.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = A032.getColumnIndexOrThrow("sync1");
                    int columnIndexOrThrow3 = A032.getColumnIndexOrThrow("display_name");
                    while (A032.moveToNext()) {
                        UserJid A002 = AnonymousClass32Y.A00(A032, columnIndexOrThrow2);
                        if (A002 != null) {
                            A0s.add(new AnonymousClass2ZH(A002, A032.getString(columnIndexOrThrow3), A032.getLong(columnIndexOrThrow)));
                        }
                    }
                    A032.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                AnonymousClass2ZH r2 = (AnonymousClass2ZH) it.next();
                if (A0s2.size() >= 100) {
                    A00(r4.A0R(), "error updating contact data action strings", A0s2);
                }
                String A0I = this.A04.A0I(AnonymousClass36P.A07(r2.A01.user));
                String valueOf = String.valueOf(r2.A00);
                Context context2 = context;
                A0s2.add(ContentProviderOperation.newUpdate(A0H2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.profile"}).withValue("data3", AnonymousClass0x2.A0X(context2, A0I, 1, R.string.f11nameremoved)).withYieldAllowed(true).build());
                C18270x1.A0Z(ContentProviderOperation.newUpdate(A0H2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"}), AnonymousClass0x2.A0X(context2, A0I, 1, R.string.f11nameremoved), "data3", A0s2);
                C18270x1.A0Z(ContentProviderOperation.newUpdate(A0H2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.video.call"}), AnonymousClass0x2.A0X(context2, A0I, 1, R.string.f11nameremoved), "data3", A0s2);
            }
            if (!A0s2.isEmpty()) {
                A00(r4.A0R(), "error updating contact data action strings", A0s2);
            }
        }
        return;
        throw th;
    }

    public AnonymousClass338(C56972sr r1, C44772Xk r2, C620633i r3, AnonymousClass33p r4, C620733j r5, C60152y5 r6, AnonymousClass4FS r7) {
        this.A00 = r1;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
    }
}
