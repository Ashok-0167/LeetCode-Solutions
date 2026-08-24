/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
/**
 * Definition for singly-linked list.
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        // Step 1: Create a dummy node to build the result list
        ListNode* dummy = new ListNode(0);
        ListNode* current = dummy;
        int carry = 0;

        // Step 2: Iterate while there are nodes in l1 or l2 or a remaining carry
        while (l1 != nullptr || l2 != nullptr || carry != 0) {
            int val1 = (l1 != nullptr) ? l1->val : 0;
            int val2 = (l2 != nullptr) ? l2->val : 0;

            // Step 3: Calculate Sum and Carry
            int sum = val1 + val2 + carry;
            carry = sum / 10;          // Get the tens digit (carry)
            int digit = sum % 10;      // Get the ones digit (actual node value)

            // Step 4: Create new node and move forward
            current->next = new ListNode(digit);
            current = current->next;

            if (l1 != nullptr) l1 = l1->next;
            if (l2 != nullptr) l2 = l2->next;
        }

        return dummy->next; // Return the head of the actual result list
    }
};