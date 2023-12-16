package com.whatsapp.gallerypicker;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass30B;
import X.AnonymousClass33p;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass5CQ;
import X.AnonymousClass5JL;
import X.AnonymousClass5PE;
import X.AnonymousClass5RC;
import X.AnonymousClass5U6;
import X.AnonymousClass5XO;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass69G;
import X.C08240dc;
import X.C08310eF;
import X.C105365Uq;
import X.C106035Xj;
import X.C107275b2;
import X.C107335b8;
import X.C107345b9;
import X.C107465bM;
import X.C113895mA;
import X.C114015mM;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C183538qC;
import X.C50022hV;
import X.C56972sr;
import X.C58152un;
import X.C620733j;
import X.C626936e;
import X.C64773Ex;
import X.C69263Wi;
import X.C86664Kz;
import X.C89564dg;
import X.C95814uZ;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextPaint;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class GalleryPicker extends C89564dg {
    public int A00 = 7;
    public long A01;
    public View A02;
    public BottomSheetBehavior A03;
    public AnonymousClass30B A04;
    public C64773Ex A05;
    public AnonymousClass5ZU A06;
    public C105365Uq A07;
    public C114015mM A08;
    public AnonymousClass5U6 A09;
    public AnonymousClass5RC A0A;
    public C113895mA A0B;
    public AnonymousClass5ZR A0C;
    public AnonymousClass5JL A0D;
    public C50022hV A0E;
    public C183538qC A0F;
    public C183538qC A0G;
    public C183538qC A0H;
    public C183538qC A0I;

    public void onCreate(Bundle bundle) {
        A5j(5);
        if (C107275b2.A00) {
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            Window window = getWindow();
            window.requestFeature(13);
            window.requestFeature(12);
            window.setExitTransition(inflateTransition);
            window.setReenterTransition(inflateTransition2);
        }
        super.onCreate(bundle);
        this.A01 = System.currentTimeMillis();
        AnonymousClass1VX r1 = this.A0D;
        AnonymousClass5ZR r0 = this.A0C;
        if (r0 == null) {
            throw C18270x1.A0S("waPermissionsHelper");
        } else if (!RequestPermissionActivity.A0q(this, r0, r1)) {
            finish();
        } else {
            boolean z = this instanceof GalleryPickerBottomSheetActivity;
            int i = R.layout.f8nameremoved;
            if (z) {
                i = R.layout.f8nameremoved;
            }
            setContentView(i);
            C95814uZ A052 = C95814uZ.A00.A05(getIntent().getStringExtra("jid"));
            Toolbar toolbar = (Toolbar) C18290x4.A0L(this, R.id.toolbar);
            setSupportActionBar(toolbar);
            Window window2 = getWindow();
            C162457s7.A0D(window2);
            int i2 = 1;
            AnonymousClass5CQ.A00(window2, C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved), true);
            toolbar.setVisibility(8);
            this.A00 = getIntent().getIntExtra("include_media", 7);
            String stringExtra = getIntent().getStringExtra("title");
            if (stringExtra == null) {
                AnonymousClass5JL r11 = this.A0D;
                if (r11 == null) {
                    throw C18270x1.A0S("chatGalleryPickerTitleProvider");
                } else if (A052 == null) {
                    stringExtra = "";
                } else {
                    AnonymousClass3ZH A0A2 = r11.A01.A0A(A052);
                    String A0H2 = r11.A02.A0H(A0A2);
                    boolean A0U = A0A2.A0U();
                    Context context = r11.A00;
                    int i3 = R.string.f11nameremoved;
                    if (A0U) {
                        i3 = R.string.f11nameremoved;
                    }
                    String A0X = AnonymousClass0x2.A0X(context, A0H2, 1, i3);
                    C162457s7.A0H(A0X);
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTextSize(context.getResources().getDimension(R.dimen.f6nameremoved));
                    CharSequence A032 = C107345b9.A03(context, textPaint, r11.A03, A0X);
                    if (A032 != null) {
                        stringExtra = A032.toString();
                    } else {
                        throw AnonymousClass001.A0c("Based on formatMidEmojiText contract, returned value can not be null");
                    }
                }
            }
            setTitle(stringExtra);
            if (bundle == null) {
                C183538qC r02 = this.A0G;
                if (r02 != null) {
                    C08310eF r3 = (C08310eF) r02.get();
                    Bundle A082 = AnonymousClass002.A08();
                    int i4 = this.A00;
                    if (i4 != 1) {
                        i2 = 2;
                        if (i4 != 2) {
                            i2 = 4;
                            if (i4 != 4) {
                                if (i4 == 7) {
                                    A082.putInt("include", 7);
                                }
                                A082.putString("gallery_picker_title", stringExtra);
                                r3.A0u(A082);
                                C08240dc A0J = AnonymousClass0x2.A0J(this);
                                A0J.A0D(r3, "gallery_picker_fragment", R.id.gallery_picker_layout);
                                A0J.A01();
                            }
                        }
                    }
                    A082.putInt("include", i2);
                    A082.putString("gallery_picker_title", stringExtra);
                    r3.A0u(A082);
                    C08240dc A0J2 = AnonymousClass0x2.A0J(this);
                    A0J2.A0D(r3, "gallery_picker_fragment", R.id.gallery_picker_layout);
                    A0J2.A01();
                } else {
                    throw C18270x1.A0S("mediaPickerFragment");
                }
            }
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM");
            Uri uri = (Uri) getIntent().getParcelableExtra("bucket_uri");
            if (uri != null) {
                Intent A0D2 = C18310x6.A0D(uri);
                A0D2.putExtra("include_media", this.A00);
                A0D2.putExtra("preview", getIntent().getBooleanExtra("preview", true));
                A0D2.putExtra("quoted_message_row_id", getIntent().getLongExtra("quoted_message_row_id", 0));
                A0D2.putExtra("quoted_group_jid", getIntent().getStringExtra("quoted_group_jid"));
                A0D2.putExtra("jid", getIntent().getStringExtra("jid"));
                A0D2.putExtra("max_items", getIntent().getIntExtra("max_items", C86664Kz.A0I(this.A0D)));
                A0D2.putExtra("skip_max_items_new_limit", getIntent().getBooleanExtra("skip_max_items_new_limit", false));
                A0D2.putExtra("is_in_multi_select_mode_only", getIntent().getBooleanExtra("is_in_multi_select_mode_only", false));
                A0D2.putExtra("android.intent.extra.STREAM", parcelableArrayListExtra);
                A0D2.putExtra("picker_open_time", getIntent().getLongExtra("picker_open_time", 0));
                A0D2.putExtra("is_send_as_document", getIntent().getBooleanExtra("is_send_as_document", false));
                A0D2.setClassName(this, "com.whatsapp.gallery.NewMediaPicker");
                startActivityForResult(A0D2, 90);
            }
            if (A052 != null && !(A052 instanceof UserJid)) {
                C50022hV r03 = this.A0E;
                if (r03 != null) {
                    r03.A00(A052);
                } else {
                    throw C18270x1.A0S("fetchPreKey");
                }
            }
            if (z) {
                View A0E2 = C18280x3.A0E(this.A00, R.id.gallery_picker_layout);
                this.A03 = new BottomSheetBehavior();
                C183538qC r04 = this.A0F;
                if (r04 != null) {
                    ((AnonymousClass5XO) r04.get()).A02(A0E2, this.A03, this, this.A0B);
                    AnonymousClass5XO.A00(this, getSupportActionBar());
                    return;
                }
                throw C18270x1.A0S("mediaAttachmentUtils");
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        String str;
        C162457s7.A0J(menu, 0);
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        int i = this.A00;
        if (i == 2) {
            str = "image/gif";
        } else if (i != 4) {
            str = "image/*";
        } else {
            str = "video/*";
        }
        intent.setType(str);
        int i2 = 0;
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
        C162457s7.A0D(queryIntentActivities);
        int size = queryIntentActivities.size();
        if (size <= 0) {
            return true;
        }
        getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
        C626936e.A06(subMenu);
        subMenu.clear();
        subMenu.setIcon(C107335b8.A04(this, R.drawable.vec_ic_more, R.color.f5nameremoved));
        menu.findItem(R.id.default_item).setVisible(false);
        Drawable A0G2 = C18310x6.A0G(this, R.mipmap.icon);
        ArrayList A0I2 = AnonymousClass002.A0I(size);
        int intrinsicHeight = A0G2.getIntrinsicHeight();
        int i3 = Integer.MIN_VALUE;
        for (ResolveInfo loadIcon : queryIntentActivities) {
            Drawable loadIcon2 = loadIcon.loadIcon(getPackageManager());
            i3 = Math.max(loadIcon2.getIntrinsicHeight(), i3);
            A0I2.add(loadIcon2);
        }
        int min = Math.min(intrinsicHeight, i3);
        for (T next : queryIntentActivities) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                throw C18280x3.A0X();
            }
            ResolveInfo resolveInfo = (ResolveInfo) next;
            Drawable A0A2 = C107335b8.A0A(getResources(), (Drawable) A0I2.get(i2), min);
            C162457s7.A0D(A0A2);
            MenuItem add = subMenu.add(resolveInfo.loadLabel(getPackageManager()));
            add.setIcon(A0A2);
            add.setOnMenuItemClickListener(new AnonymousClass69G(intent, resolveInfo, this, 2));
            i2 = i4;
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C162457s7.A0J(keyEvent, 1);
        return super.onKeyDown(i, keyEvent);
    }

    public AnonymousClass5ZC BCP() {
        AnonymousClass5ZC r0 = C58152un.A02;
        C162457s7.A0F(r0);
        return r0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 36) {
            if (i != 90) {
                if (i != 91) {
                    super.onActivityResult(i, i2, intent);
                    return;
                } else if (i2 != -1) {
                    return;
                } else {
                    if (getIntent().getBooleanExtra("preview", true)) {
                        if (intent != null) {
                            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                            if (parcelableArrayListExtra == null) {
                                if (intent.getData() != null) {
                                    parcelableArrayListExtra = AnonymousClass001.A0s();
                                } else {
                                    return;
                                }
                            }
                            AnonymousClass5PE r5 = new AnonymousClass5PE(this);
                            r5.A0G = parcelableArrayListExtra;
                            r5.A0C = AnonymousClass0x7.A0l(this);
                            r5.A02 = 1;
                            r5.A04 = System.currentTimeMillis() - this.A01;
                            r5.A05 = getIntent().getLongExtra("picker_open_time", 0);
                            r5.A0K = true;
                            r5.A06 = getIntent().getLongExtra("quoted_message_row_id", 0);
                            r5.A0D = getIntent().getStringExtra("quoted_group_jid");
                            r5.A0H = AnonymousClass0x9.A1N(getIntent(), "number_from_url");
                            startActivityForResult(r5.A01(), 90);
                            return;
                        }
                        return;
                    }
                }
            } else if (i2 != -1) {
                if (i2 == 2) {
                    setResult(2);
                    finish();
                }
                return;
            }
        } else if (i2 != -1) {
            return;
        }
        setResult(-1, intent);
        finish();
    }

    public void onBackPressed() {
        C183538qC r0 = this.A0H;
        if (r0 != null) {
            r0.get();
            super.onBackPressed();
            return;
        }
        throw C18270x1.A0S("outOfChatDisplayControllerLazy");
    }

    public void onResume() {
        super.onResume();
        C183538qC r0 = this.A0H;
        if (r0 != null) {
            boolean z = C86664Kz.A1G(r0).A03;
            View view = this.A00;
            if (z) {
                AnonymousClass1VX r15 = this.A0D;
                C69263Wi r13 = this.A05;
                C56972sr r12 = this.A01;
                AnonymousClass4FS r11 = this.A04;
                C114015mM r10 = this.A08;
                if (r10 != null) {
                    C64773Ex r9 = this.A05;
                    if (r9 != null) {
                        AnonymousClass5ZU r8 = this.A06;
                        if (r8 != null) {
                            C620733j r7 = this.A00;
                            AnonymousClass5RC r6 = this.A0A;
                            if (r6 != null) {
                                C113895mA r5 = this.A0B;
                                if (r5 != null) {
                                    C183538qC r4 = this.A0H;
                                    if (r4 != null) {
                                        C183538qC r3 = this.A0I;
                                        if (r3 != null) {
                                            View view2 = this.A02;
                                            C105365Uq r1 = this.A07;
                                            AnonymousClass33p r25 = this.A09;
                                            C113895mA r24 = r5;
                                            AnonymousClass5RC r23 = r6;
                                            C114015mM r22 = r10;
                                            C105365Uq r21 = r1;
                                            AnonymousClass5ZU r20 = r8;
                                            C64773Ex r19 = r9;
                                            C56972sr r18 = r12;
                                            C69263Wi r17 = r13;
                                            View view3 = view2;
                                            View view4 = view;
                                            Pair A002 = C107465bM.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "gallery-picker-activity");
                                            this.A02 = (View) A002.first;
                                            this.A07 = (C105365Uq) A002.second;
                                        } else {
                                            throw C18270x1.A0S("sequentialMessageControllerLazy");
                                        }
                                    } else {
                                        throw C18270x1.A0S("outOfChatDisplayControllerLazy");
                                    }
                                } else {
                                    throw C18270x1.A0S("messageAudioPlayerProvider");
                                }
                            } else {
                                throw C18270x1.A0S("messageAudioPlayerFactory");
                            }
                        } else {
                            throw C18270x1.A0S("waContactNames");
                        }
                    } else {
                        throw C18270x1.A0S("contactManager");
                    }
                } else {
                    throw C18270x1.A0S("contactPhotos");
                }
            } else if (C106035Xj.A01(view)) {
                C113895mA r2 = this.A0B;
                if (r2 != null) {
                    C183538qC r14 = this.A0H;
                    if (r14 != null) {
                        C107465bM.A04(this.A00, r2, r14);
                    } else {
                        throw C18270x1.A0S("outOfChatDisplayControllerLazy");
                    }
                } else {
                    throw C18270x1.A0S("messageAudioPlayerProvider");
                }
            }
            C183538qC r02 = this.A0H;
            if (r02 != null) {
                C106035Xj.A00(r02);
                return;
            }
            throw C18270x1.A0S("outOfChatDisplayControllerLazy");
        }
        throw C18270x1.A0S("outOfChatDisplayControllerLazy");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass30B r0 = this.A04;
        if (r0 != null) {
            r0.A02().A02.A07(-1);
            C113895mA r1 = this.A0B;
            if (r1 != null) {
                C107465bM.A02(this.A02, r1);
                C105365Uq r02 = this.A07;
                if (r02 != null) {
                    r02.A00();
                }
                this.A07 = null;
                AnonymousClass5U6 r12 = this.A09;
                if (r12 != null) {
                    r12.A02(5);
                    C107275b2.A07(this, this.A0D);
                    return;
                }
                throw C18270x1.A0S("conversationAttachmentEventLogger");
            }
            throw C18270x1.A0S("messageAudioPlayerProvider");
        }
        throw C18270x1.A0S("caches");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        C113895mA r0 = this.A0B;
        if (r0 != null) {
            C107465bM.A07(r0);
            C183538qC r02 = this.A0H;
            if (r02 != null) {
                AnonymousClass4SG.A3g(this, r02);
                return;
            }
            throw C18270x1.A0S("outOfChatDisplayControllerLazy");
        }
        throw C18270x1.A0S("messageAudioPlayerProvider");
    }

    public void onStart() {
        super.onStart();
        if (this.A03 != null && (this instanceof GalleryPickerBottomSheetActivity)) {
            C183538qC r0 = this.A0F;
            if (r0 != null) {
                ((AnonymousClass5XO) r0.get()).A03(this.A03, this);
                return;
            }
            throw C18270x1.A0S("mediaAttachmentUtils");
        }
    }
}
