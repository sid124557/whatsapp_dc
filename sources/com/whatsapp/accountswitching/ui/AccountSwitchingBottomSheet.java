package com.whatsapp.accountswitching.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass1RR;
import X.AnonymousClass33p;
import X.AnonymousClass35Q;
import X.AnonymousClass3Z6;
import X.AnonymousClass4FS;
import X.AnonymousClass4GP;
import X.AnonymousClass5XC;
import X.AnonymousClass66R;
import X.AnonymousClass68M;
import X.C08310eF;
import X.C103045Lg;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18310x6;
import X.C45052Ym;
import X.C45472a4;
import X.C53542nG;
import X.C53892nq;
import X.C55682qk;
import X.C56972sr;
import X.C57072t2;
import X.C613330g;
import X.C613630k;
import X.C614930z;
import X.C620733j;
import X.C69263Wi;
import X.C97024xV;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class AccountSwitchingBottomSheet extends Hilt_AccountSwitchingBottomSheet {
    public int A00;
    public View A01;
    public ViewStub A02;
    public BottomSheetListView A03;
    public C55682qk A04;
    public C69263Wi A05;
    public C56972sr A06;
    public C614930z A07;
    public C613630k A08;
    public AnonymousClass5XC A09;
    public C103045Lg A0A;
    public C97024xV A0B;
    public C613330g A0C;
    public AnonymousClass33p A0D;
    public C620733j A0E;
    public C45052Ym A0F;
    public C53542nG A0G;
    public C45472a4 A0H;
    public AnonymousClass4FS A0I;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0c() {
        this.A03 = null;
        this.A02 = null;
        C103045Lg r1 = this.A0A;
        if (r1 != null) {
            C97024xV r0 = this.A0B;
            if (r0 != null) {
                r0.A07(r1);
            } else {
                throw C18270x1.A0S("inactiveAccountBadgingObservers");
            }
        }
        super.A0c();
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        Log.i("AccountSwitchingBottomSheet/onViewCreated");
        Bundle bundle2 = this.A06;
        if (bundle2 == null) {
            bundle2 = AnonymousClass002.A08();
        }
        this.A00 = bundle2.getInt("source", 0);
        this.A01 = view;
        AnonymousClass4FS r2 = this.A0I;
        if (r2 != null) {
            AnonymousClass0x7.A1B(new AnonymousClass68M((Object) this, 2), r2);
            AnonymousClass5XC r22 = this.A09;
            if (r22 != null) {
                r22.A00(this.A00, 1);
                return;
            }
            throw C18270x1.A0S("accountSwitchingLogger");
        }
        throw C18270x1.A0S("waWorkers");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        Log.i("AccountSwitchingBottomSheet/onDismiss");
        AnonymousClass5XC r2 = this.A09;
        if (r2 != null) {
            r2.A00(this.A00, 2);
            return;
        }
        throw C18270x1.A0S("accountSwitchingLogger");
    }

    public final C69263Wi A1Y() {
        C69263Wi r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C614930z A1Z() {
        C614930z r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("accountSwitcher");
    }

    public final List A1a() {
        Bitmap bitmap;
        Bitmap bitmap2;
        StringBuilder A0l;
        String str;
        String A0X;
        ArrayList A0s = AnonymousClass001.A0s();
        C53892nq A012 = A1Z().A01();
        if (A012 != null) {
            C56972sr r0 = this.A06;
            if (r0 != null) {
                AnonymousClass1RR A013 = C56972sr.A01(r0);
                if (A013 != null) {
                    int dimensionPixelSize = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
                    C613330g r4 = this.A0C;
                    if (r4 != null) {
                        bitmap = r4.A03(A0G(), A013, -1.0f, dimensionPixelSize, false);
                    } else {
                        throw C18270x1.A0S("contactPhotosBitmapManager");
                    }
                } else {
                    bitmap = null;
                }
                AnonymousClass3Z6.A03(A012, bitmap, A0s);
                C613630k r02 = this.A08;
                if (r02 != null) {
                    for (C53892nq r5 : r02.A02().A01) {
                        C614930z A1Z = A1Z();
                        C162457s7.A0J(r5, 0);
                        AnonymousClass35Q r2 = (AnonymousClass35Q) A1Z.A0H.get();
                        if (r2 != null) {
                            AnonymousClass66R r1 = r2.A0A;
                            if (!((File) r1.getValue()).exists()) {
                                A0X = "AccountSwitchingFileManager/getInactiveAccountProfilePhoto/staging dir does not exist";
                            } else {
                                String absolutePath = ((File) r1.getValue()).getAbsolutePath();
                                String str2 = r5.A07;
                                File file = new File(absolutePath, str2);
                                if (!file.exists()) {
                                    StringBuilder A0l2 = AnonymousClass000.A0l("AccountSwitchingFileManager/getInactiveAccountProfilePhotoPath/account ");
                                    A0l2.append(C57072t2.A01(str2));
                                    C18260x0.A1L(A0l2, " dir does not exist");
                                    A0l = AnonymousClass001.A0o();
                                    A0l.append("AccountSwitchingFileManager/getInactiveAccountProfilePhotoPath/stagingDirLogString/");
                                    str = C57072t2.A00(r2);
                                } else {
                                    File file2 = new File(file.getAbsolutePath(), "files/me.jpg");
                                    if (!file2.exists()) {
                                        A0l = AnonymousClass000.A0l("AccountSwitchingFileManager/getInactiveAccountProfilePhotoPath/account ");
                                        A0l.append(C57072t2.A01(str2));
                                        str = " img file does not exist";
                                    } else {
                                        String absolutePath2 = file2.getAbsolutePath();
                                        if (absolutePath2 != null) {
                                            bitmap2 = BitmapFactory.decodeFile(absolutePath2);
                                            AnonymousClass3Z6.A03(r5, bitmap2, A0s);
                                        }
                                    }
                                }
                                A0X = AnonymousClass000.A0X(str, A0l);
                            }
                            Log.i(A0X);
                        }
                        bitmap2 = null;
                        AnonymousClass3Z6.A03(r5, bitmap2, A0s);
                    }
                } else {
                    throw C18270x1.A0S("accountSwitchingDataRepo");
                }
            } else {
                throw C18270x1.A0S("meManager");
            }
        }
        return A0s;
    }

    public final void A1b(Context context) {
        if (A1Z().A0A(context, (String) null, (String) null, (AnonymousClass4GP) null, this.A00, true, false)) {
            AnonymousClass33p r1 = this.A0D;
            if (r1 != null) {
                r1.A1A(A1Z().A0A.A0C() + 1);
                return;
            }
            throw C18270x1.A0S("waSharedPreferences");
        }
    }
}
