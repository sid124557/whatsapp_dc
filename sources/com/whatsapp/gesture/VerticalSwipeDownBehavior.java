package com.whatsapp.gesture;

import X.AnonymousClass000;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x9;
import X.C05630Ug;
import X.C147297Do;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior;
import java.lang.ref.WeakReference;

public class VerticalSwipeDownBehavior extends C05630Ug {
    public float A00;
    public float A01;
    public int A02 = -1;
    public C147297Do A03;
    public WeakReference A04;
    public boolean A05;
    public final int A06;

    public final void A0L(float f) {
        ObservableListView observableListView;
        boolean z;
        WeakReference weakReference = this.A04;
        if (weakReference != null && (weakReference.get() instanceof ObservableListView) && (observableListView = (ObservableListView) weakReference.get()) != null) {
            int i = observableListView.A04;
            if (observableListView.getFirstVisiblePosition() == 0 || i == 0) {
                float f2 = this.A00;
                float f3 = (float) this.A06;
                if (f - f2 > f3 && !this.A05) {
                    this.A01 = f2 + f3;
                    z = true;
                } else {
                    return;
                }
            } else {
                z = false;
            }
            this.A05 = z;
        }
    }

    public VerticalSwipeDownBehavior(Context context) {
        this.A06 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.A02;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        A0L(motionEvent.getY(findPointerIndex));
                    }
                    return false;
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.A02) {
                            this.A02 = motionEvent.getPointerId(AnonymousClass000.A1T(actionIndex) ? 1 : 0);
                        }
                    }
                }
            }
            this.A05 = false;
            this.A02 = -1;
        } else {
            int pointerId = motionEvent.getPointerId(0);
            this.A02 = pointerId;
            this.A05 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.A00 = motionEvent.getY(findPointerIndex2);
            }
            return false;
        }
        return this.A05;
    }

    public boolean A0F(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C147297Do r0;
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.A02);
                    if (findPointerIndex >= 0) {
                        float y = motionEvent.getY(findPointerIndex);
                        A0L(y);
                        if (this.A05) {
                            float f = (y - this.A01) * 0.5f;
                            if (f > 0.0f && (r0 = this.A03) != null) {
                                VerticalSwipeToRevealBehavior verticalSwipeToRevealBehavior = r0.A00;
                                if (verticalSwipeToRevealBehavior.A00 == Float.MIN_VALUE) {
                                    verticalSwipeToRevealBehavior.A00 = f;
                                }
                                VerticalSwipeToRevealBehavior.A00(verticalSwipeToRevealBehavior, f, 1);
                                return true;
                            }
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            return false;
                        }
                    } else if (actionMasked == 6) {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex2) == this.A02) {
                            actionIndex = AnonymousClass000.A1T(actionIndex2);
                        }
                    }
                    this.A02 = motionEvent.getPointerId(actionIndex);
                }
                return true;
            }
            int findPointerIndex2 = motionEvent.findPointerIndex(this.A02);
            if (findPointerIndex2 >= 0) {
                if (this.A05) {
                    this.A05 = false;
                    float y2 = (motionEvent.getY(findPointerIndex2) - this.A01) * 0.5f;
                    C147297Do r02 = this.A03;
                    if (r02 != null) {
                        VerticalSwipeToRevealBehavior.A00(r02.A00, y2, 2);
                    }
                }
                this.A02 = -1;
            }
            return false;
        }
        this.A02 = motionEvent.getPointerId(0);
        this.A05 = false;
        return true;
    }

    public boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        coordinatorLayout.A0B(view, i);
        View A0K = A0K(view);
        if (A0K == null) {
            return true;
        }
        this.A04 = AnonymousClass0x9.A14(A0K);
        return true;
    }

    public final View A0K(View view) {
        if (AnonymousClass0YZ.A0H(view) || (view instanceof AbsListView)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A0K = A0K(viewGroup.getChildAt(i));
                if (A0K != null) {
                    return A0K;
                }
            }
        }
        return null;
    }
}
